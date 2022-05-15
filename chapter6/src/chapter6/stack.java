package chapter6;

public class stack {
	int st[] = new int [10];
	int top;
	stack()
	{
		top = -1;
	}
	
	void push(int it)
	{
		if(top == 9)
		{
			System.out.println("Stack is overflow!!");
		}
		else
		{
			st[++top] = it;
		}
	}
	
	int pop()
	{
		if(top<0)
		{
			System.out.println("Stack is underflow!!");
			return 0;
		}
		else {
			return st[top--];
		}
	}
	public static void main(String[] args) {
		stack ob = new stack();
		
		for(int i=0; i<10; i++)
		{
			ob.push(i);
		}
		
		for(int i=0; i<10; i++)
		{
			System.out.println(ob.pop());
		}
		

	}

}
