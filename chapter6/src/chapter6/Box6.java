package chapter6;

public class Box6 {
	double w;
	double h;
	double d;
	Box6(double width, double height, double depth){
		System.out.println("Contructing Box");
		w = width;
		d = height;
		h = depth;
	}
	Box6(int w, int h, int d){
		System.out.println("Contructing Box");
		this.w = w;
		this.h = h;
		this.d = d;
	}
	double vol()
	{
		return w*h*d;
	}
	public static void main(String[] args) {
		Box6 mybox2 = new Box6(10,25,36);
		System.out.println(mybox2.vol());
	}

}
