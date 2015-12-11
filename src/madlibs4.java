import javax.swing.JOptionPane;

public class madlibs4 {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
String adjective=JOptionPane.showInputDialog("type an adjective");
		// Get the user to enter a type of liquid
String liquid=JOptionPane.showInputDialog("type a type of liquid");
		// Get the user to enter a body part
String body=JOptionPane.showInputDialog("type a body part");
		// Get the user to enter a verb
String verb=JOptionPane.showInputDialog("type a verb");
		// Get the user to enter a place
String place=JOptionPane.showInputDialog("type a place");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line.
		JOptionPane.showMessageDialog(null, "Once upon a time there was a group of kids stuck on a " +place+ " There biggest problem would be to find a source of " +liquid+ " then it got really hot and when the kids took off there cloths you could see there " +body+ " then there was a storm and you could see " +adjective+ " in the sky. There was a beast on the island and in order to escape they had to " +verb+ " away. In the end they were rescued. ");

	}
}