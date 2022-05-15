package StringBuffer;

public class Lecture1 {
	public static void main(String[] args)
	{
		
		StringBuffer ab = new StringBuffer("Afnan");
		System.out.println(ab);
		
		ab.append(" is a noob coder");
		System.out.println(ab);
		//ab.reverse();
		
		//ab.delete(0, 1);
		//ab.setLength(5);
		
		String sr = "Afnan";
		StringBuffer sb = new StringBuffer(sr);
		String s2 = sb.reverse().toString();
		if(sr.equals(s2))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("is not a palindrome");
		}
		
		
		System.out.println(ab);
	}
}
