import javax.swing.JOptionPane;

public class unbirthday {
	public static void main(String[] args) {

		String birthday = JOptionPane.showInputDialog("When is your birthday?(type it in digets)");
		if (birthday.equals("1/7"))
			JOptionPane.showMessageDialog(null, ("happy birthday!"));
		else
			JOptionPane.showMessageDialog(null, "happy unbirthday!");
	}
}