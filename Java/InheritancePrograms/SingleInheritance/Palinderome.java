import java.io.*;
class parent
{
	int num;
	public void pal(int num)
	{
		this.num = num;
	}
}
class child extends parent
{
	int rev = 0,rem,temp;
	public void cal()
	{
		temp = num;
		
		rem = num % 10;
		rev = (rev*10)+rem;
		num = num / 10;
	}
	if(num == rev)
	{
		System.out.prinln("Number Is Palindrome");
	}
	else
	{
		System.out.println("Number Is Not Palindrome");
	}
}
class Palinderome
{
	public static void main(String[]args)
	{
		child c1 = new child();	
		      c1.pal(153);
		      c1.cal();
	}
}
