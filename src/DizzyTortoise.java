import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class DizzyTortoise {

	public static void main(String[] args) {
		
		 // 1. Use the dance method to make the Tortoise spin.
		String Dizzy= JOptionPane.showInputDialog(null, "How Dizzy do you want your Tortoise to be?");
Tortoise.setSpeed(3);
		  int spinNumber=Integer.parseInt(Dizzy);
		  dance(spinNumber);
		 // 2. Ask the user how dizzy you want the tortoise from 1-10, then spin
		  //that number of times.

	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}