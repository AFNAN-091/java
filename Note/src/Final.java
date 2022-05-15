
public class Final {
	static int i = 0;
	int test(int ... v)
	{
		int sum = 0;
		for(var x : v)
			sum += x;
		return sum;
	}
	public static void main(String[] args) {
		Final ob = new Final();
		System.out.println(ob.test(1,2,3)); 
		ob.test(1,2,3,4,5);
		
	}
	

}


//
