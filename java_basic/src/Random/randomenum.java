package Random;
import java.util.Random;

public class randomenum {
	public static void main(String[] args)
	{
		Random rand = new Random();
		int random = rand.nextInt(10)+11;
		System.out.println(random);
		
	}
}
