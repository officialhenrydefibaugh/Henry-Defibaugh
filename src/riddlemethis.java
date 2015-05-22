import javax.swing.JOptionPane;

public class riddlemethis {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/the-riddler
String riddle=JOptionPane.showInputDialog("What has a foot but no legs?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddle.equals("a snail")) {
	JOptionPane.showMessageDialog(null, "Great jod!");
	
	score +=1;

}
		// 5. Otherwise, say "wrong" and tell them the answer
		// 6. Add some more riddles
String riddle2=JOptionPane.showInputDialog(null,"I’m tall when I’m young and I’m short when I’m old. What am I?");
		// 2. Make a pop up to show the score.
if (riddle2.equals("a candle")) {
	JOptionPane.showMessageDialog(null, "Great jod!");
	score +=1;
}
else {
	JOptionPane.showMessageDialog(null, "You were wrong :(");
}
JOptionPane.showMessageDialog(null, score);
	}
}