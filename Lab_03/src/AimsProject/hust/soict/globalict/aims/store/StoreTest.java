package AimsProject.hust.soict.globalict.aims.store;

import AimsProject.hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class StoreTest {

	public static void main(String[] args) {
		Store items = new Store();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion King", "Animation", "Roger Allers", 87, 19.95f);
		items.addDVD(dvd1);
		
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		items.addDVD(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		items.addDVD(dvd3);
		
		items.displayInfo();
		items.removeDVD(dvd2);
		items.displayInfo();
	}

}
