import javax.swing.JOptionPane;

public class Guesstheanimal {
	public static void main(String[] args) {
		JOptionPane
				.showMessageDialog(null,
						"I am thinking of a pig, a bird, a Zebra, a snake or a monkey?");
		String answer = JOptionPane.showInputDialog("Does it have four legs?");
		if (answer.equals("yes")) {
			String answer2 = JOptionPane
					.showInputDialog("Does it have stripes?");
			if (answer2.equals("yes")) {
				JOptionPane.showMessageDialog(null, "then it is a zebra");
			} else {
				JOptionPane.showMessageDialog(null, "then it is a pig");
			}
		} else {
			String answer3 = JOptionPane
					.showInputDialog("Does it have feathers?");
			if (answer3.equals("yes")) {
				JOptionPane.showMessageDialog(null, "then it is a bird");
			} else {
				String scales = JOptionPane
						.showInputDialog("Does it have scales?");
				if (scales.equals("yes")) {
					JOptionPane.showMessageDialog(null, "then it is a snake");
				} else {
					
					JOptionPane.showMessageDialog(null, "then it is a monkey");
				}

			}
		}
	}
}