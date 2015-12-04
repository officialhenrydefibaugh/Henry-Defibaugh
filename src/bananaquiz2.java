
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class bananaquiz2 {

	public static void main(String[] args) {
		// 1. ask the user if they like bananas
		String banana = JOptionPane.showInputDialog("Do you like bananas?");
		// 2. if they say no,
		// tell them they are crazy
		// and end quiz
		if (banana.equals("no")) {
			JOptionPane.showMessageDialog(null, "You are crazy");
		}
		// 3. if they say yes
		// ask them what is their favorite hobby
		// show a pop up that says "<your hobby> is much better with bananas!"
		if (banana.equals("yes")) {
			String hobby = JOptionPane.showInputDialog("What is your favorite hobby?");
			JOptionPane.showMessageDialog(null, hobby + " is much better with bananas!");
		}
	}

}