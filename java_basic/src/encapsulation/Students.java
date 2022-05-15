package encapsulation;

public class Students extends people {
	String name;
	int age;
	int roll;
	
	void display()
	{
		System.out.println("name "+name);
		System.out.println("Age "+age);
		System.out.println("Roll "+roll);
	}
	
}
