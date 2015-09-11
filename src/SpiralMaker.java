// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class SpiralMaker {

	public static void main(String[] args) {
		
		// 3. Make a variable to hold the number of sides and set it to 0
		int sides=0;
		// 4. Ask the user which spiral they would like (square, triangle, or pentagon)
		String spiral=JOptionPane.showInputDialog("Which spiral would you like to see (square, triangle or pentagon?)");
		// 5. Set the number of sides depending on what the user entered (multiple lines of code)
		if (spiral.equals("triangle")) {
			sides=3;
		}
		else if (spiral.equals("square")) {
			sides=4;
		}
		else if (spiral.equals("pentagon")) {
			sides=5;
		}
		
		// 6. If the user enters something else, say "Sorry, I don't know how to draw a ..."
		else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't know how to draw a " + spiral);
		}
		
		// 1. Make the Tortoise draw a square spiral shape. If you get stuck, use these instructions: http://bit.ly/YJUOkn
		Tortoise.show();
		Tortoise.setSpeed(10);
		for (int i = 0; i < 80; i++) {
			Tortoise.move(4*i);
		Tortoise.turn(360/sides);
		}
		// 2. Change your code to turn the square spiral into a triangle spiral
		
	}

}