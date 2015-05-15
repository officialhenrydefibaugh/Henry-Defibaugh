import javax.swing.JOptionPane;
public class madlibs2 {
public static void main(String[] args) {
	String noun=JOptionPane.showInputDialog("give moi a noun");
	String verb=JOptionPane.showInputDialog("give moi a verb");
	String adjective=JOptionPane.showInputDialog("give moi an adjective");
JOptionPane.showMessageDialog(null, " Once upon a time there was a " + noun + " this " + noun + " went to " + verb + " Once this " + noun + " went to " + verb + " a " + adjective + " poop went to a " + noun + " THE END ");
}
}
