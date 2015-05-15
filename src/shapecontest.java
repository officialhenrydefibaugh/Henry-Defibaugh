import org.teachingextensions.logo.Tortoise;

public class shapecontest

{
	public static void main(String[] args)
	{

		int spiral = 10;
		Tortoise.setSpeed(10);
		for (int i = 0; i < 599; i++)
		{
			Tortoise.move(i);
			Tortoise.turn(100);
			spiral = spiral + 10;
		}
	}
}