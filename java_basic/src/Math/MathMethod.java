package Math;

class test{
	//static int a=3;
	static int b =50;
	
	static{
		System.out.println("it's call form static block! "+b);
		b++;
	}
}


public class MathMethod {
	
	public static void main(String[] args)
	{
		test obj = new test();
		test obj1 = new test();
//		test.cls();
//		test.cls();
//		obj.a = 30;
//		obj.b = 20;
//		
//		obj.Aetc(49);
	//	obj.c = 50;  don't allow access
		
		//System.out.println(obj.a+ " "+ obj.b + " " + obj.getc());
		
		
	}
}

