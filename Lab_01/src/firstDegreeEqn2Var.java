import javax.swing.JOptionPane;
import java.lang.Math;

// Solve a1 + b1 = c1
//       a2 + b2 = c2

public class firstDegreeEqn2Var {

	public static void main(String[] args) {
		String A1, A2, B1, B2, C1, C2;
		
		// Get the input string
		A1 = JOptionPane.showInputDialog("Enter a1: ");
		B1 = JOptionPane.showInputDialog("Enter b1: ");
		C1 = JOptionPane.showInputDialog("Enter c1: ");
		A2 = JOptionPane.showInputDialog("Enter a2: ");
		B2 = JOptionPane.showInputDialog("Enter b2: ");
		C2 = JOptionPane.showInputDialog("Enter c2: ");
		
		// Convert into double
		double a1 = Double.parseDouble(A1);
    	double a2 = Double.parseDouble(A2);
    	double b1 = Double.parseDouble(B1);
    	double b2 = Double.parseDouble(B2);
    	double c1 = Double.parseDouble(C1);
    	double c2 = Double.parseDouble(C2);
    	
    	double D = a1 * b2 - a2 * b1;
    	double Dx = c1 * b2 - c2 * b1;
    	double Dy = a1 * c2 - a2 * c1;
    	
    	String ans;
    	if (D == 0) {
    		if (Dx == 0) ans = "The system has infinitely many solutions!\n";
    		else ans = "The system has no solutions!\n";
    	}
    	else {
    		double x = Dx/D, y = Dy/D;
    		ans = "We have a solution (" + String.valueOf(x) + "," + String.valueOf(y) + ")";
    	}

    	JOptionPane.showMessageDialog(null, ans);
	}

}
