package AimsProject.hust.soict.globalict.aims.store;

import AimsProject.hust.soict.globalict.aims.disc.DigitalVideoDisc;
import java.util.ArrayList;
import AimsProject.hust.soict.globalict.aims.media.Media;

public class Store {
	private ArrayList <Media> itemsInStore = new ArrayList <Media>();
	
	public ArrayList <Media> getItems(){
		return itemsInStore;
	}
	
	public void addMedia(Media disc) {
		itemsInStore.add(disc);
		System.out.println("Add Successfully");
	}
	
	public void removeMedia(Media disc) {
		if (itemsInStore.contains(disc)) {
			itemsInStore.remove(disc);
			System.out.println("Remove successfullly!");
		}
		else System.out.println("Does not exist!");
	}
	
	public void displayInfo() {
		System.out.println("**********Store**********");
		System.out.println("Items: ");
		
		int count = 1;
		for (Media item : itemsInStore) {
			System.out.println(count + " - " + item);
			count += 1;
		}
		System.out.println("*************************");
	}
}	
