import java.io.*;
class Parent 
{
	int num1;
	public void get(int n)
	{
		num1 = n;
	}
}
class Child extends Parent
{
	int num2;
	
	public void getC(int n1)
	{
		num2 = n1;
	}
	public void power()
	{
		int pow = 1;
		
		for(int i = 1; i <= num2; i++)
		{
			pow = pow*num1;
		}
	System.out.println("Raised to ="+pow);
	}
}
class power
{
		public static void main(String[]args)
		{
			Child c = new Child();
			      c.get(5);
			      c.getC(10);
			      c.power();
		}
}
