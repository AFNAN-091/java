package chapter6;

public class Box5 {
	double w;
	double h;
	double d;
	Box5(){
		System.out.println("Contructing Box");
		w = 10;
		d = 30;
		h = 28;
	}
	double vol()
	{
		return w*h*d;
	}
	public static void main(String[] args) {
		Box5 mybox2 = new Box5();
		System.out.println(mybox2.vol());
	}

}
