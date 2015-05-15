// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class airline {
	public static void main(String[] args)
	{
		String last=JOptionPane.showInputDialog("Enter your last name.");
		String first=JOptionPane.showInputDialog("Enter your first name.");
		String birthday=JOptionPane.showInputDialog("Enter your birthday.");
		String gender=JOptionPane.showInputDialog("Are you a male or a female?");
		String destination=JOptionPane.showInputDialog("Where are you going?");
JOptionPane.showMessageDialog(null, last +" / " + first + " (" + birthday + " ) " + gender + destination);

	}
}