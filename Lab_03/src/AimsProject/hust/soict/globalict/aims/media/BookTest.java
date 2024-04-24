package AimsProject.hust.soict.globalict.aims.media;

import java.util.List;
import java.util.ArrayList;


public class BookTest {

	public static void main(String[] args) {
		List<String> authors = new ArrayList<>();
		authors.add("Munwind"); authors.add("Minh"); authors.add("Lehau");
		
		Book book = new Book(1, "Star War", "ads", 18.5f, authors);
		System.out.println(book.getAuthors());
		book.addAuthor("Kien");
		System.out.println(book.getAuthors());
		book.removeAuthor("Lehau");
		System.out.println(book.getAuthors());
	}

}
