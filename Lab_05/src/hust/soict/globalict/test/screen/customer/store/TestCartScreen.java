package hust.soict.globalict.test.screen.customer.store;

import AimsProject.hust.soict.globalict.aims.cart.Cart;
import AimsProject.hust.soict.globalict.aims.media.book.Book;
import AimsProject.hust.soict.globalict.aims.media.disc.CompactDisc;
import AimsProject.hust.soict.globalict.aims.media.disc.DigitalVideoDisc;
import AimsProject.hust.soict.globalict.aims.store.Store;
import hust.soict.globalict.aims.exception.LimitExceededException;
import hust.soict.globalict.aims.screen.customer.controller.CartController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestCartScreen extends Application{
	private static Store store;
	private static Cart cart;

	public static void main(String[] args) throws LimitExceededException {
		// TODO Auto-generated method stub
		store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1,"Harry Potter and the Philosopher's Stone(2001)","Fantasy",3.0f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2,"Harry Potter and the Chamber of Secrets(2002)","Fantasy",3.5f);
        CompactDisc cd5 = new CompactDisc(5,"Fetch the Bolt Cutters","Unknown",10.39f);
        CompactDisc cd6 = new CompactDisc(6,"Future Nostalgia","Unknown",9.6f);
        Book book7 = new Book(7,"The Hunger Games","Unknown",5.5f);
        Book book8 = new Book(8,"Catching Fire","Unknown",4.9f);
        Book book9 = new Book(9,"Mockingjay","Unknown",5.1f);
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(cd5);
        store.addMedia(cd6);
        store.addMedia(book7);
        store.addMedia(book8);
        store.addMedia(book9);
        cart = new Cart();
        cart.addMedia(dvd1,store);
        cart.addMedia(dvd2,store);
        cart.addMedia(cd5,store);
        cart.addMedia(cd6,store);
        cart.addMedia(book7,store);
        cart.addMedia(book8,store);
        cart.addMedia(book9,store);

        launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		final String STORE_FXML_FILE_PATH = "/hust/soict/globalict/aims/screen/customer/view/Cart.fxml";
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(STORE_FXML_FILE_PATH));
		CartController cartController = new CartController(cart, store);
		fxmlLoader.setController(cartController);
		Parent root = fxmlLoader.load();

		primaryStage.setTitle("Cart");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}

}
