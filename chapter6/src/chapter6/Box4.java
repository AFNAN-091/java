package chapter6;

public class Box4 {
	double w;
	double h;
	double d;
	double vol()
	{
			return w*h*d;
	}
	void setdim(double width, double height, double depth)
	{
		w = width;
		h = height;
		d = depth;
	}
	public static void main(String[] args) {
		Box4 mybox2 = new Box4();
		Box4 mybox1 = new Box4();
		
		double vol;
		
		mybox1.setdim(10,20,30);
		mybox2.setdim(10,29,39);
		
		System.out.println("volume of Mybox1 is "+ mybox1.vol());
		System.out.println("volume of Mybox2 is "+ mybox2.vol());
		
	}

}
