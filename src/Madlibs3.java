import javax.swing.JOptionPane;


public class Madlibs3
{
public static void main(String[] args)
{
	String noun=JOptionPane.showInputDialog(null, "write a noun");
	String verb=JOptionPane.showInputDialog(null, "write a verb");
	String adjective=JOptionPane.showInputDialog(null, "write a adjective");
	String noun2=JOptionPane.showInputDialog(null, "write another noun");
	String adjective2=JOptionPane.showInputDialog(null, "write another adjective");
	String verb2=JOptionPane.showInputDialog(null, "write another verb");
	String noun3=JOptionPane.showInputDialog(null, "write another nother noun");
	JOptionPane.showMessageDialog(null, "Once upon a time, there was a man named supernugget. His sidekick (GreshTooFresh) would always help his master in the hunger games. One time in the hunger games they desided to"+noun+ "Then there was a" +adjective+" "+noun2+ "This was an evil dude and he tried killing us! What kind of an evil person would do such a thing?! So we take out our" +noun3+ "and start killing him. We won the fight and eat him alive! He was very" +adjective2+ "and we suggest to never try killing us, because you will die. MUHAHAHAHAHAHA!");
}
}