import javax.swing.JOptionPane;

public class Votingbooth {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old are you?");
		int age2 = Integer.parseInt(age);
		if (age2 >= 18) {
			String vote = JOptionPane.showInputDialog("Who do you want for presedent?");
			if (vote.equals("Donald Trump")) {
				JOptionPane.showMessageDialog(null, "You should go and see a doctor.");
			} else {
				JOptionPane.showMessageDialog(null, "Cool, I agree!");
			}

		} else {
			JOptionPane.showMessageDialog(null, "You are to young to vote.");
		}
	}
}