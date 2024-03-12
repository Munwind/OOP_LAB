import javax.swing.JOptionPane;
import java.lang.Math;

// Solve ax2 + bx + c = 0
public class secondDegreeEqn {

	public static void main(String[] args) {
		String strA, strB, strC;
		
		// Get the input
		strA = JOptionPane.showInputDialog("Enter a: ");
		strB = JOptionPane.showInputDialog("Enter b: ");
		strC = JOptionPane.showInputDialog("Enter c: ");
		
		// Convert to double
		double a = Double.parseDouble(strA);
    	double b = Double.parseDouble(strB);
    	double c = Double.parseDouble(strC);
    		
    	double delta = b * b - 4 * a * c;
    	String ans;
    	
    	if (delta < 0) {
    		ans = "There are no solutions!\n";
    	}
    	else if (delta == 0) {
    		double res = -b / (2 * a);
    		ans = "There is a solution: " + String.valueOf(res);
    	}
    	else {
    		double res1 = (-b + Math.sqrt(delta)) / (2 * a);
    		double res2 = (-b - Math.sqrt(delta)) / (2 * a);
    		ans = "There are 2 solutions: " + String.valueOf(res1) + "and " + String.valueOf(res2);
    	}
    	
    	JOptionPane.showMessageDialog(null, ans);
	}

}
