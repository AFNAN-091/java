package practice;

class test {
	
	int i = 10;
	private int j;
	test(){
		
	}
}

class A extends test{
	int k;
	A(){
		k = 10;
	}
}

class B extends A{
	int c;
}

class Main{
	public static void main(String args[])
	{
		 test obj = new test();
		 A obj1 = new A();
		 test demo;
		 demo = obj1;
		 System.out.println(demo.i);
		 
	}
}
