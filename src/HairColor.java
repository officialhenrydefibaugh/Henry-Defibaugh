import javax.swing.JOptionPane;

public class HairColor {
public static void main(String[] args) {
	String hairColor=JOptionPane.showInputDialog("What is your hair color?");
	if(hairColor.equals("pink")){
		System.out.println(("your hair is pink"));
	}
	else if (hairColor.equals("grey")) {
		System.out.println("old man");
	} else {
System.out.println("I don't know that color.");
	}
}
}