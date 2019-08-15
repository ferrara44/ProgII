package TP1;
import javax.swing.*;
public class ofage {
	
	public static void main(String[] args) {
		String name;
		String ageStr;
		int age;
		do {
	    name = JOptionPane.showInputDialog(null, "Please enter your name.");
	    ageStr = JOptionPane.showInputDialog(null, "Please enter your age.");
	    age = Integer.parseInt(ageStr);
	    if (age>17) {
	    	System.out.printf("%s ("+age+") is of legal age.\n", name);
	    	}
	    else if (age > 0) {
	    	System.out.printf("%s ("+age+") is NOT of legal age.\n", name);
	    }
	    else if (age < 0) {
	    	System.out.printf("%s ("+age+") has not been born yet.\n", name);
	    }
		}while (age != 0);
	    System.exit(0);
	}

}