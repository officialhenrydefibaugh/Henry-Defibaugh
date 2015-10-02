import javax.swing.JOptionPane;


public class MyAges {
public static void main(String[] args) {
	String age=JOptionPane.showInputDialog("How old are you?");
	int a23=Integer.parseInt(age);
	for (int i = 0; i < a23; i++) {
	System.out.println(i);	
	}

}
}