import java.io.*;
class parent
{
	int num;
	public void getValue(int n)
	{
		num = n;
	}
	
}
class Child extends parent
{
	public void cal()
	{
		int i;
		
		for(i = num; i <= 50; i++)
		{
			System.out.println(i);
		}
	}
}
class PrintNumber
{
	
	public static void main(String[]args)
	{
		Child c1 = new Child();
			c1.getvalue(11);
			c1.cal();
	}
}
			