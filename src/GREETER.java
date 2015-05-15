import javax.swing.JOptionPane;


public class GREETER
{
public static void main(String[] args)
{
	String Henry=JOptionPane.showInputDialog(null, "What is your name");
	JOptionPane.showMessageDialog(null, "Hello" + Henry);

}
}