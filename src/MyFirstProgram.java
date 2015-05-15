import org.teachingextensions.logo.Tortoise;

public class MyFirstProgram {
	public static void main(String[] args) {
		Tortoise.show();
		
		for (int i = 0; i < 4; i++)
		{
			Tortoise.move(100);
			Tortoise.turn(90);
		}
		
		
	}
}
