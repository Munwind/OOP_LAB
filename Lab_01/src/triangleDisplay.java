import java.util.Scanner;

// Drawing the stars
public class triangleDisplay {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) System.out.print(" ");
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
