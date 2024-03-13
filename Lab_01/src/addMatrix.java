import java.util.Scanner;

public class addMatrix {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the size of the matrix: ");
		int m = scanner.nextInt(), n = scanner.nextInt();
		int matrix1[][] = new int[n][m], matrix2[][] = new int[n][m];
		
		System.out.println("Enter the first matrix: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix1[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Enter the second matrix: ");
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++) {
				int temp = scanner.nextInt();
				matrix2[i][j] = matrix1[i][j] + temp;
			}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) System.out.print(matrix2[i][j] + " ");
			System.out.println();
		}
		
	}
}
