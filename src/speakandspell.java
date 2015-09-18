import javax.swing.JOptionPane;

/**
 * Teacher's Note: Have the kids play with the Speak & Spell. The first Speak &
 * Spell was introduced at the summer Consumer Electronics Show in June 1978,
 * making it one of the earliest handheld electronic devices with a visual
 * display to use interchangeable game cartridges. Discuss with students how you
 * would make this program. Allow them to code it themselves, or use this
 * recipe.
 **/

public class speakandspell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("callipygian");
		// 2. Catch the user's answer in a String
		String speak = JOptionPane.showInputDialog("spell the mentioned word");

		// 3. If the user spelled the word correctly, speak "correct"
		if (speak.equals("callipygian")) {
			speak("correct");

		}
		// 4. Otherwise say "wrong"
		else {
			speak("WRONG!!!");
			JOptionPane.showMessageDialog(null, "SO WRONG!!!");
		}
		// 5. repeat the process for other words
		speak("accoutrements");
		String speak2 = JOptionPane.showInputDialog("spell the mentioned word");
		if (speak.equals("accoutrements")) {
			speak("correct");
		} else {
			speak("WRONG!!!");
			JOptionPane.showMessageDialog(null, "SO WRONG!!!");
		}
		speak("yolo swag bruh buttery moist");
		String speak3 = JOptionPane.showInputDialog("spell the mentioned word");
		if (speak.equals("yolo swag bruh buttery moist")) {
			speak("correct");
		} else {
			speak("WRONG!!!");
			JOptionPane.showMessageDialog(null, "SO WRONG!!!");
		}
JOptionPane.showMessageDialog(null, "You get a bad score either way TROLL");
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}