package AimsProject.hust.soict.globalict.test;

import AimsProject.hust.soict.globalict.aims.cart.Cart;
import AimsProject.hust.soict.globalict.aims.disc.DigitalVideoDisc;
import AimsProject.hust.soict.globalict.aims.media.Track;

public class CartTest {

	public static void main(String[] args) {
		Cart cart = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion King", "Animation", "Roger Allers", 87, 19.95f);
		cart.addMedia(dvd1);
		
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		cart.addMedia(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		cart.addMedia(dvd3);
		
		cart.displayInfo();
		cart.searchInCart(1);
		cart.searchInCart(4);
		cart.searchInCart("The lion King");
		cart.searchInCart("Munwind");
		dvd1.play();
		
		
		System.out.println();
		System.out.println();
		
		Track track1 = new Track("Munwind", 15);
		track1.play();
	}

}
