// Copyright Wintriss Technical Schools 2015
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class Colors1 { 
	public static void main(String[] args) {

		// 3. ask the user what color they would like the tortoise to draw
		String color = JOptionPane
				.showInputDialog("What color do you want the tortoise to draw?");
		// 4. use an if/else statement to set the pen color that the user
		// requested
		if (color.equals("blue")) {
			Tortoise.setPenColor(Color.BLUE);
		} else if (color.equals("green")) {
			Tortoise.setPenColor(Color.GREEN); }
			else if (color.equals("red")) {
				Tortoise.setPenColor(Color.RED);}
				else if (color.equals("yellow")) { 
					Tortoise.setPenColor(Color.YELLOW); 
					
		}
	
		// 5. if the user doesn’t enter anything, choose a random color
				else Tortoise.setPenColor(Colors.getRandomColor());
		// 6. put a loop around your code so that you keep asking the user for
		// more colors & drawing them

		// 2. set the pen width to 10
		Tortoise.setPenWidth(100);
		// 1. make the tortoise draw a shape (this will take more than one line
		// of code)
		for (int i = 0; i < 4; i++) {
			Tortoise.setSpeed(10);
			Tortoise.move(100);
			Tortoise.turn(90);
		}

	}
}
	