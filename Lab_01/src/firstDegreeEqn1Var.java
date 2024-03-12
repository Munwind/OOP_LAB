import javax.swing.JOptionPane;
import java.lang.Math;

// Solve ax + b = 0
public class firstDegreeEqn1Var {

	public static void main(String[] args) {
		String str1, str2;
		
		// Input
		str1 = JOptionPane.showInputDialog("Enter a: ");
    	str2 = JOptionPane.showInputDialog("Enter b: ");
    	
    	// Convert to double
    	double a = Double.parseDouble(str1);
    	double b = Double.parseDouble(str2);
    	String ans;
    	
    	if (a == 0) {
    		if (b == 0) ans = "There are infinitely many solutions!\n";
    		else ans = "There are no solutions!\n";
    	}
    	else {
    		double res = -b/a;
    		ans = "There is one solution: " + String.valueOf(res);
    	}
    	
    	JOptionPane.showMessageDialog(null, ans);

	}

}
