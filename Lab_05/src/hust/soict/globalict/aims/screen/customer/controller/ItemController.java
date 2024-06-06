package hust.soict.globalict.aims.screen.customer.controller;

import javax.swing.JOptionPane;

import AimsProject.hust.soict.globalict.aims.cart.Cart;
import AimsProject.hust.soict.globalict.aims.media.Media;
import AimsProject.hust.soict.globalict.aims.media.Playable;
import AimsProject.hust.soict.globalict.aims.media.disc.CompactDisc;
import AimsProject.hust.soict.globalict.aims.media.disc.DigitalVideoDisc;
import AimsProject.hust.soict.globalict.aims.media.disc.Track;
import AimsProject.hust.soict.globalict.aims.store.Store;
import hust.soict.globalict.aims.exception.LimitExceededException;
import hust.soict.globalict.aims.exception.PlayerException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class ItemController {
	private Media media;  // The media item being controlled
	private Cart cart;  // The shopping cart
	private Store store;  // The store
	
	// FXML annotations to link UI components
    @FXML
    private Label lblTitle;  // Label for the media title

    @FXML
    private Label lblCost;  // Label for the media cost

    @FXML
    private Button btnAddToCart;  // Button to add media to cart

    @FXML
    private Button btnPlay;  // Button to play media
    
    // Handler for "Add to Cart" button click event
    @FXML
    void btnAddToCartClicked(ActionEvent event) throws LimitExceededException {
    	cart.addMedia(media, store);  // Add the media item to the cart
    }

    // Handler for "Play" button click event
    @FXML
    void btnPlayClicked(ActionEvent event) throws PlayerException {
        StringBuilder output = new StringBuilder();  // StringBuilder for output message
        
        if (media instanceof DigitalVideoDisc){
        	DigitalVideoDisc DVD = (DigitalVideoDisc) media;
        	if (DVD.getLength() >= 0) {
                // Create a new information dialog
                Alert dialog = new Alert(AlertType.INFORMATION);

                // Set the dialog title and header text
                dialog.setTitle("Media Player");
                dialog.setHeaderText("Playing media...");
                
        		output = new StringBuilder("Playing DVD: " + media.getTitle() + "\nLength: " + ((DigitalVideoDisc) media).getLength());
                
        		// Set the dialog content
                dialog.setContentText(output.toString());

                // Show the dialog and wait for the user to click "OK"
                dialog.showAndWait();
        	} else {
            	JOptionPane.showMessageDialog(null, "ERROR!", "Illegal", JOptionPane.WARNING_MESSAGE);  // Show error message
                throw new PlayerException("ERROR!");  // Throw PlayerException
            }
        } else if (media instanceof CompactDisc) {
            output = new StringBuilder("Playing CD: " + media.getTitle() + "\n");
            for (Track track : ((CompactDisc) media).getTracks()) {
            	if (track.getLength() >= 0) {
            		output.append("Track: ").append(track.getTitle()).append(". Length: ").append(track.getLength()).append("\n");
            	} else {
                	JOptionPane.showMessageDialog(null, "ERROR!", "Illegal Length", JOptionPane.WARNING_MESSAGE);  // Show error message
                    throw new PlayerException("ERROR!");  // Throw PlayerException
            	}
            }

            // Create and show information dialog
            Alert dialog = new Alert(AlertType.INFORMATION);

            dialog.setTitle("Media Player");
            dialog.setHeaderText("Playing media...");
    		
            dialog.setContentText(output.toString());

            dialog.showAndWait();
        }
    }
    
    // Constructor to initialize the controller with cart and store
    public ItemController (Cart cart, Store store) {
    	this.cart = cart;
    	this.store = store;
    }
    
    // Method to set data for the media item
	public void setData(Media media) {
		this.media = media;
		lblTitle.setText(media.getTitle());  // Set the title label
		lblCost.setText("$"+ media.getCost());  // Set the cost label
		if(media instanceof Playable) {
			btnPlay.setVisible(true);  // Show play button if media is playable
		} else {
			btnPlay.setVisible(false);  // Hide play button if media is not playable
			HBox.setMargin(btnAddToCart, new Insets(0 , 0, 0, 60));  // Adjust margin if play button is hidden
		}
	}
}
