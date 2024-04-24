package AimsProject.hust.soict.globalict.aims.cart;

import java.util.ArrayList;

import AimsProject.hust.soict.globalict.aims.disc.DigitalVideoDisc;
import AimsProject.hust.soict.globalict.aims.media.Book;
import AimsProject.hust.soict.globalict.aims.media.CompactDisc;
import AimsProject.hust.soict.globalict.aims.media.Media;

public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private ArrayList <Media> itemsOrdered = new ArrayList<Media>();
	
	public void addMedia(Media media) {
		if (itemsOrdered.contains(media))
			System.out.println("This media exist!");
		else {
			itemsOrdered.add(media);
			System.out.println("Successfully added");
		}
	}
	
	public void removeMedia(Media media) {
		if (itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
			System.out.println("Successfully removed");
		}
		else
			System.out.println("The media does not exist!");
	}
	
	public float totalCost() {
		float total_cost = 0;
		for (Media dvd : itemsOrdered) {
			if (dvd != null) total_cost += dvd.getCost();
		}
		
		return total_cost;
	}
	
	// Keep track of the number of DVDs
	public int qtyOrdered() {
		int count = 0;
		for (Media dvd : itemsOrdered) {
	        if (dvd != null) {
	            count++;
	        }
	    }
		return count;
	}
	
	public void displayInfo() {
		System.out.println("**********CART**********");
		System.out.println("Ordered Items: ");
		
		int count = 1;
		for (Media item : itemsOrdered) {
			if (item == null) break;
			System.out.println(count + " - " + item);
			count += 1;
		}
			
		System.out.println("Total Cost = " + totalCost());
		System.out.println("************************");
	}
	
	public void searchInCart(int id) {
		for (Media element : itemsOrdered) {
			if (element.getId() == id) {
				System.out.println(element);
				return;
			}
		}
		System.out.println("Does not exist!");
	}
	
	public void searchInCart(String title) {
		for (Media element : itemsOrdered) {
			if (element.isMatch(title)) {
				System.out.println(element);
				return;
			}
		}
		System.out.println("Does not exist!");
	}
	
}

