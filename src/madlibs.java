import javax.swing.JOptionPane;


public class madlibs {
	public static void main(String[] args) {
		String input=JOptionPane.showInputDialog("What is your name");
		String input2=JOptionPane.showInputDialog("Where is your favorite place to visit?");
		JOptionPane.showMessageDialog(null, " I know that your name is " + input + " and I know that you like to visit " + input2 + " Muahahahaha ");
	}
}