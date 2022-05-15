package chapter6;

public class Box3 {
	double w;
	double h;
	double d;
	double vol()
	{
			return w*h*d;
	}
	public static void main(String[] args) {
		Box3 mybox2 = new Box3();
		Box3 mybox1 = new Box3();
		
		mybox1.w = 10;
		mybox1.h = 20;
		mybox1.d = 30;
		mybox2.w = 10;
		mybox2.h = 20;
		mybox2.d = 16;
		
		System.out.println("volume of Box1 is "+ mybox1.vol());
	
		System.out.println("volume of Box2 is "+ mybox2.vol());

	}

}
