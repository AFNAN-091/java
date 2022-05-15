class outer{
	
	int x = 49;
	static int y = 39;
	void out(){
		System.out.println("outer class!");
	}
	static class inner{
		int b = 40;
		void fun() {
			
			System.out.println("inner class "+ y + " "+ b);
		}
	}
	
	class inner2{
		static int a = 38;
		void fun1() {
			System.out.println("Inner class "+ x + " " + a);
		}
	}
}


class test{
	public static void main(String args[])
	{
		outer obj = new outer();
		//obj.out();
		outer.inner obj1 = new outer.inner(); /*
		 if inner class has applied static modifier
		*/
		
		 outer.inner2 obj2 = obj.new inner2(); 
		/*		
		if inner class is non static 
		*/
		obj1.fun();
		obj2.fun1();
		//obj1.fun();
		for(int i=0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}
	}
}
