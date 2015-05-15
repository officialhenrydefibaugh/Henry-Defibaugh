
import javax.swing.JOptionPane;

public class worlddomination {
	public static void main(String[] args) {
		String answer = JOptionPane
				.showInputDialog("Do you know how to write code?");
		if (answer.equals("yes")) {
			JOptionPane.showMessageDialog(null, "You will rule the world");
		} else {
			JOptionPane.showMessageDialog(null, "Good luck washing dishes");

		}
	}
}