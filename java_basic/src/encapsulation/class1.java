package encapsulation;

public class class1 {
	private String name;
	private int age;
	
	//when name ans age both are public
//	public void setname(String name,int age)
//	{
//		this.name = name;
//		this.age = age;
//	}
//	
//	public String getname()
//	{
//		return name;
//	}
//	void display()
//	{
//		System.out.println("Name "+name);
//		System.out.println("Age "+age);
//	}
	
	public String getname(){
		return name;
	}
	public void setname(String name){
		this.name = name;
	}
	public int getage()
	{
		return age;
		
	}
	public void setage(int age)
	{
		this.age = age;
	}
	
	
}
