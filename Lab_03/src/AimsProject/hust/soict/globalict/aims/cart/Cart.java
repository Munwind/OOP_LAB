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
	
	// Search for the DVD by Title
	public void isMatch(String titleFind) {
		int count = 1;
		for (Media item : itemsOrdered) {
			if (item == null) break;
			
			if (item.getTitle().equals(titleFind)) {
				System.out.println(count + " - " + item);
				return;
			}
			count += 1;
		}
		
		System.out.println("There's no items with that title!");
	}
	
}

