import java.io.*;
class Parent
{
	 int num1,num2;
	
	public void get(int a,int b)
	{
		num1 = a;
		num2 = b;
	}
	public void addition()
	{
		int sum;
		sum = num1 + num2;
		System.out.println("Addtion ="+sum);
	}
}
class Child extends Parent
{
	public void substraction()
	{
		int sub;
		sub = num1 - num2;
		System.out.println("Substraction ="+sub);
	}
}
class Arithmetic
{
		public static void main(String[]args)
		{
			Child c = new Child();
			    c.get(20,10);
			    c.addition();
			    c.substraction();
		}
}