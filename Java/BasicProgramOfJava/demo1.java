import java.io.*;
class pal
{
	private int num;
	public void get_Value(int num) 
	{
		this.num = num;
	}
	public void cal()
	{
		int rem,rev = 0,temp = 0;
		temp = num;
		
		do
		{
			rem = num % 10;
			rev = (rev * 10)+rem;
			num = num / 10;
		}while(num > 0);
		
		if(temp == num)
		{
			System.out.println("The Number Is Palindrome");
		}
		else
		{
			System.out.println("The Number Is Not Palindrome");
		}
	}
}
class palindrome
{
	public static void main(String[]args)
	{
		pal p1 = new pal();
		    p1.get_value(121);
		    p1.cal();
	}
}