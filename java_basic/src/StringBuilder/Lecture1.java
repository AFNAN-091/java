package StringBuilder;

public class Lecture1 {
	public static void main(String[] args)
	{
		StringBuilder str = new StringBuilder("Afnan");
		System.out.println("string = "+str);
		str.append(" is a lazy boy");
		System.out.println(str);
		str.delete(1, 4);
		System.out.println(str);
	}
}
