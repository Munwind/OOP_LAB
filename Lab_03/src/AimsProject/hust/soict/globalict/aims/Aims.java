package AimsProject.hust.soict.globalict.aims;
import AimsProject.hust.soict.globalict.aims.disc.DigitalVideoDisc;

import java.util.ArrayList;
import java.util.List;

import AimsProject.hust.soict.globalict.aims.cart.Cart;
import AimsProject.hust.soict.globalict.aims.store.Store;
import AimsProject.hust.soict.globalict.aims.media.Book;

public class Aims {
	public static void addToStore(Store store) {
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "The lion King", "Animation", "Roger Allers", 87, 19.95f);
		store.addMedia(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		store.addMedia(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		store.addMedia(dvd3);
		
		List <String> author1 = new ArrayList<String>();
		author1.add("Munwind");
		author1.add("Lehau");
		
		List <String> author2 = new ArrayList<String>();
		author2.add("Minh");
		author2.add("Kien");
		
		Book book1 = new Book(3, "Come to future", "Harmony", 99.99f, author1);
		store.addMedia(book1);
		Book book2 = new Book(4, "We are ones", "The Hunt", 1.1f, author2);
		store.addMedia(book2);
		
	}
	
	// Complete the menu later
	public static void main(String[] args) {
		Store store = new Store();
		addToStore(store);
		Cart cart = new Cart();
	}
	
	public static void showMenu() {
		System.out.println("AIMS: ");
        System.out.println("------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
	}
	
	public static void storeMenu() {
		System.out.println("Options: ");
        System.out.println("-------------------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("-------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
	}
	
	public static void mediaDetailsMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	
	public static void cartMenu() {
		System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
	}
}

