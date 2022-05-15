package String;
import java.util.Arrays;
import java.util.Scanner;
public class ForbiddenString {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		
		int n;
		n = cin.nextInt();
		while(n-- > 0 )
		{
			String s,t,str;
			s = cin.next();
			str = s;
			t = cin.next();
			char[] ch = s.toCharArray();
			Arrays.sort(ch);
			s = String.valueOf(ch);
			if(str.compareTo(s)>0)
			{
				if(! s.contains(t))
				{
					System.out.println(s);
				}
			}



		}
			

	}

}
