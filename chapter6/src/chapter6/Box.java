package chapter6;

public class Box {
	double w;
	double h;
	double d;
	public static void main(String[] args) {
		Box mybox = new Box();
		double vol;
		mybox.w = 10;
		mybox.h = 20;
		mybox.d = 30;
		vol = mybox.w*mybox.h*mybox.d;
		System.out.println("volume is "+ vol);

	}

}
