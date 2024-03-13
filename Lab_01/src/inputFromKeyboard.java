import java.util.Scanner;

public class inputFromKeyboard {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What's your name: ");
		String name = scanner.nextLine();
		
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		
		System.out.println("How tall are you (m)?");
		double height = scanner.nextDouble();
		
		String ans = "Mrs/Mr. " + name + " is " +  String.valueOf(age) +". Your height is " + String.valueOf(height) + ".";
		
		System.out.println(ans);

	}

}
