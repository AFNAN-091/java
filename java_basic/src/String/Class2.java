package String;

public class Class2 {
	public static void main(String[] args)
	{
		String name = "Saied Afnan ";
		System.out.println(name);
		
		char ch = name.charAt(1);
		System.out.println(ch);
		
		int val = name.codePointAt(0);
		System.out.println(val);
		int pos = name.indexOf('a');
		System.out.println(pos);
		pos = name.lastIndexOf('n');
		System.out.println(pos);
		String[] s;
		name = name.replace('n', 'm');
		System.out.println(name);
		s = name.split(" ");
		System.out.println(s[1]);
		
	}
}
