import java.io.*;
class student
{
	public  int p = 89;
	public int c = 87;
	public  int m = 90;
	public  int b = 99;
	public int g = 91;	

	public void get()
	{
		 int p = 89;
		 int c = 87;
		 int m = 90;
		 int b = 99;
		 int g = 91;
	}
}
class marks extends student
{
	public void cal()
	{
		int Total;
		float per;
		
		Total = p + c + m + b+ g;
		per    = Total/5f;
		
		System.out.println("Total Marks = "+Total);
		System.out.println("Percentage ="+per);
	}
}
class StudMar
{
	public static void main(String[]args)
	{
		marks m1 = new marks();
		      m1.get();
		      m1.cal();
	}
}