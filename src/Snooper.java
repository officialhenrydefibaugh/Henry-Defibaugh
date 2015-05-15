import javax.swing.JOptionPane;


public class Snooper
{
public static void main(String[] args)
{
String color=JOptionPane.showInputDialog(null, "What is your favorite color?");
String band=JOptionPane.showInputDialog(null, "What is your favorite band?");
String show=JOptionPane.showInputDialog(null, "What is your favorite show?");
JOptionPane.showMessageDialog(null, "I know what your favorite color is" +  color);
JOptionPane.showMessageDialog(null, "I know what your favorite band is" +  band);
JOptionPane.showMessageDialog(null, "I know what your favorite show is" +  show);
JOptionPane.showMessageDialog(null, "muhahahahahahahahahahaha");
}
}