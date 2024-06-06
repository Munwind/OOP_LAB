package hust.soict.globalict.aims.screen.customer.controller;

import java.io.IOException;

import AimsProject.hust.soict.globalict.aims.cart.Cart;
import AimsProject.hust.soict.globalict.aims.store.Store;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ViewStoreController {
	private Store store;  // The store instance
	private Cart cart;  // The shopping cart instance
	
	@FXML
    private GridPane gridPane;  // GridPane to display items in the store
    
    // Constructor to initialize the controller with store and cart
    public ViewStoreController(Store store, Cart cart) {
    	this.store = store;
    	this.cart = cart;
    }
    
    @FXML
    private Button btnViewCart;  // Button to view the cart

    // Handler for "View Cart" button press event
    @FXML
    void btnViewCartPressed(ActionEvent event) {
    	try {
    		System.out.println("GAY");
			final String STORE_FXML_FILE_PATH = "/hust/soict/globalict/aims/screen/customer/view/Cart.fxml";
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(STORE_FXML_FILE_PATH));
			CartController cartController = new CartController(cart, store);  // Create CartController instance
			fxmlLoader.setController(cartController);  // Set controller for FXML loader
			Parent root = fxmlLoader.load();  // Load the FXML file
			Stage primaryStage = (Stage)((Node) event.getSource()).getScene().getWindow();  // Get the current stage
			primaryStage.setTitle("Cart");  // Set the stage title
			primaryStage.setScene(new Scene(root));  // Set the scene
			primaryStage.show();  // Show the stage
    	} catch(IOException e) {
    		e.printStackTrace();  // Print the stack trace for any IO exception
    	}
    }
    
    // Initialize method to set up the store view
    @FXML
    public void initialize() {
    	final String ITEM_FXML_FILE_PATH = "/hust/soict/globalict/aims/screen/customer/view/Item.fxml";
    	int column = 0;
    	int row = 1;
    	for (int i = 0; i < store.itemsInStore.size(); i ++) {  // Iterate over items in the store
    		try {
    			FXMLLoader fxmlLoader = new FXMLLoader();
    			fxmlLoader.setLocation(getClass().getResource(ITEM_FXML_FILE_PATH));  // Set location for item FXML file
    			ItemController itemController = new ItemController(cart, store);  // Create ItemController instance
    			fxmlLoader.setController(itemController);  // Set controller for FXML loader
    			AnchorPane anchorPane = new AnchorPane();
    			anchorPane = fxmlLoader.load();  // Load the FXML file
    			itemController.setData(store.itemsInStore.get(i));  // Set data for the item
    			if(column == 3) {
    				column = 0;
    				row++;
    			}
    			gridPane.add(anchorPane, column++, row);  // Add the item to the grid pane
    			GridPane.setMargin(anchorPane, new Insets(20,10,10,10));  // Set margin for the item
    			
    		} catch(IOException e) {
    			e.printStackTrace();  // Print the stack trace for any IO exception
    		}
    	}
    }
    
}
