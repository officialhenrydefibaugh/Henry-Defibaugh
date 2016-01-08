import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class dontforgetthelyrics {
	/*
	 * For this game, we'll play the start of a song, and the player has to guess the rest of the lyrics.
	 * 
	 * 1. To record a sound clip, open Audacity and record your song.
	 * 
	 * 2. Click File -> Export Audio, and save your file on the Desktop.
	 * 
	 * 3. Drag your file from the Desktop into the "default package" under "src".
	 */
	
	public static void main(String[] args) {
		// 4. Make a pop-up to explain the game.
JOptionPane.showMessageDialog(null, "For this game I sing a line of a song and you guess the next line of the song.");
		// 5. Use the playSound method to play your song.
playSound("singing.wav");
		// 6. Make a pop-up for the player to type their answer.
String answer=JOptionPane.showInputDialog("Put your answer here---->");
		// 7. If they answered correctly, tell them that they were right.
if(answer.equals("I am going to change you like a remix")){
	JOptionPane.showMessageDialog(null, "You are correct!");
}

		// 8. Otherwise, tell them they are wrong, and give them the answer.
else {
	JOptionPane.showMessageDialog(null, "WRONG!");
}
		// 9. Record another sound and repeat steps 5-8.

		// 10. [optional] Add a points variable that will calculate their final score.
	}

	public static void playSound(String fileName) {
		AudioClip audioClip = JApplet.newAudioClip(new dontforgetthelyrics().getClass().getResource(fileName));
		audioClip.play();
	}
}