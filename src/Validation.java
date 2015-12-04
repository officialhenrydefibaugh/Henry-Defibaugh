import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018

		// 2. On paper, write all the numbers that get printed when you run this
		// class

		// 3. Use the randomNumber to give the user a random compliment.
		for (int i = 0; i < 10; i++) {
			int randomNumber = new Random().nextInt(5);
			System.out.println(randomNumber);

			if (randomNumber == 0) {
				JOptionPane.showMessageDialog(null, "You look amazing today");
			}
			if (randomNumber == 1) {
				JOptionPane.showMessageDialog(null, "You are so helpful");
			}
			if (randomNumber == 2) {
				JOptionPane.showMessageDialog(null, "You have an amazing life ahead of you");
			}
			if (randomNumber == 3) {
				JOptionPane.showMessageDialog(null, "You are needed in the world");
			}
			if (randomNumber == 4) {
				JOptionPane.showMessageDialog(null, "You are going to be rich in the future");
			}
		}
	}
	// 4. Repeat all the code above 10 times

	// 5. Find someone to test out your program. They will like it :)
}