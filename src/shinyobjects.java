import java.io.File;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class shinyobjects {

	public static void main(String[] args) {
		// 2. Ask the user how many shiny objects they want
String shiny = JOptionPane.showInputDialog(null, "How many objects do you want?");
		// 3. Play the sound that many times
int number = Integer.parseInt(shiny);
		// 1. Call the method below
for (int i = 0; i < number; i++) {
	playMisterZee();
}
		

		

	}

	public static void playMisterZee() {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File(
							"/Users/Guest/Desktop/shiny-objects.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}