
public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	
	// Add new DVDs
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		int index = qtyOrdered();
		if (index >= 20) {
			System.out.println("Sorry! The cart is full!");
		}
		else {
			itemsOrdered[index] = disc;
	        System.out.println("DVD \"" + disc.getTitle() + "\" added to the cart.");
		}
	}
	
	// Remove items
	public void removeDigialVideoDisc(DigitalVideoDisc disc) {
		boolean found = false;
	    for (int i = 0; i < itemsOrdered.length; i++) {
	        if (itemsOrdered[i] == disc) {
	            found = true;
	            
	            for (int j = i; j < itemsOrdered.length - 1; j++) {
	                itemsOrdered[j] = itemsOrdered[j + 1];
	            }
	            
	            itemsOrdered[itemsOrdered.length - 1] = null;
	            System.out.println("DVD \"" + disc.getTitle() + "\" removed from the cart.");
	            break; // Exit the loop after removing the DVD
	        }
	    }
	    if (!found) {
	        System.out.println("DVD \"" + disc.getTitle() + "\" not found in the cart.");
	    }
	}
	
	public float totalCost() {
		float total_cost = 0;
		for (DigitalVideoDisc dvd : itemsOrdered) {
			if (dvd != null) total_cost += dvd.getCost();
		}
		
		return total_cost;
	}
	
	// Keep track of the number of DVDs
	public int qtyOrdered() {
		int count = 0;
		for (DigitalVideoDisc dvd : itemsOrdered) {
	        if (dvd != null) {
	            count++;
	        }
	    }
		return count;
	}
	
}
