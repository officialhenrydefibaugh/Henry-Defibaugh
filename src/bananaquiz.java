// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class bananaquiz {

	public static void main(String[] args) {
		// 1. ask the user if they like bananas
		String banana = JOptionPane.showInputDialog("Do you like bananas?");
		// 2. if they say no,
		// tell them they are crazy
		// and end quiz
		if (banana.equals("no")) {
			JOptionPane.showMessageDialog(null, "You are crazy.");
		}
		// 3. if they say yes
		// ask them what is their favorite hobby
		// show a pop up that says "<your hobby> is much better with bananas!"
		else if (banana.equals("yes")) {
			String banana2 = JOptionPane.showInputDialog(null, "What is your favorite hobby?");
			JOptionPane.showMessageDialog(null, banana2 + " is much better with bananas!");
		}
	}

}