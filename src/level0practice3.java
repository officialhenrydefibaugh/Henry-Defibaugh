import javax.swing.JOptionPane;

public class level0practice3 {
	public static void main(String[] args) {
		String animal = JOptionPane.showInputDialog("What animal do you like?");
		if (animal.equals("dog")) {
			System.out.println("Dogs go woof");
		} else if (animal.equals("cat")) {
			System.out.println("Cats go meow");
		} else {
			System.out.println("I don't know that animal.");
		}
	}
}