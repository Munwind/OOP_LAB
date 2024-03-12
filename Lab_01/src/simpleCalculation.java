import javax.swing.JOptionPane;
import java.lang.Math;

public class simpleCalculation {
    public static void main(String[] args) {
    	String str1, str2;
    	double num1, num2;
    	
    	str1 = JOptionPane.showInputDialog("Enter the first number: ");
    	str2 = JOptionPane.showInputDialog("Enter the second number: ");
    	
    	num1 = Double.parseDouble(str1);
    	num2 = Double.parseDouble(str2);
    	
    	double sum = num1 + num2;
    	double diff = Math.abs(num1 - num2);
    	double product = num1 * num2;
    	double quotient = num1 / num2;
    	
    	String ans = "Sum = " + sum + "\n" + "Difference = " + diff + "\n"
    				+ "Product = " + product + "\n" + "Quotient = " + quotient + "\n";
    	
    	JOptionPane.showMessageDialog(null, ans);
    	
    	System.exit(0);
    }
}
