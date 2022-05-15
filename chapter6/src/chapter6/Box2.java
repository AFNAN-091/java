package chapter6;

public class Box2 {
	double w;
	double h;
	double d;
	public static void main(String[] args) {
		Box2 mybox2 = new Box2();
		Box2 mybox1 = new Box2();
		double vol;
		mybox1.w = 10;
		mybox1.h = 20;
		mybox1.d = 30;
		mybox2.w = 10;
		mybox2.h = 20;
		mybox2.d = 15;
		vol = mybox1.w*mybox1.h*mybox1.d;
		System.out.println("volume is "+ vol);
		vol = mybox2.w*mybox2.h*mybox2.d;
		System.out.println("volume is "+ vol);

	}

}
