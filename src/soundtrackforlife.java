import java.net.URI;

import javax.swing.JOptionPane;

public class soundtrackforlife {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "Which mood are you in?", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "angry", "confident", "relieved" }, null);
		
		// 2. Their answer is stored in the userMood variable. Print it out.
System.out.println(userMood);
if (userMood==0) {
	playVideo("https://www.youtube.com/watch?v=F21aifX0lZY");
}
if (userMood==1) {
	playVideo("https://www.youtube.com/watch?v=DhlPAj38rHc");
}
if (userMood==2) {
	playVideo("https://www.youtube.com/watch?v=wqZ5iLOUOGA");
}

		// 3. If they are in a angry mood, use the playVideo method to play a calming song from YouTube.

		// 4. Play different songs for other moods.


		// If you are seeing ads at the beginning of your videos, install Adblock.

	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}