 // Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class Birthdayreminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "March 20th";
		String dadsBirthday = "May 2nd";
		String myBirthday = "March 11th";
		String sistersBirthday = "November 6th";

		for (int i = 0; i < 4; i++) {
			
		
		// 2. Find out which birthday the user wants and and store their response in a variable
	String birthday = JOptionPane.showInputDialog("Who's birthday do you want to know?");
		// 3. Print out what the user typed
		System.out.println(birthday);
		// 4. if user asked for "mom"
			//print mom's birthday
		if (birthday .equals ("mom"))
		{
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if (birthday .equals ("dad"))
		JOptionPane.showMessageDialog(null, dadsBirthday);
		// 6. if user asked for your name
			// print myBirthday
		else if (birthday .equals ("me"))
		JOptionPane.showMessageDialog(null, myBirthday);
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else
JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
	} 
}
	}