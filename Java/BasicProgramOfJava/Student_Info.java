import java.io.*;
class SInfo
{
	private int rno,mob;
	private string snm,add;
	public void get(int r,int m,string nm,string address)
	{
		rno = r;
		mob = m;
		snm = nm;
		add = address;
	}
	public void show()
	{
		System.out.println("Student Information");	
		System.out.println(" Roll No = "+rno);
		System.out.println("Name ="+snm);	
		System.out.println("Mobile No ="+mob);	
		System.out.println("Address ="+add);
	}
}
class Student_Info
{
	public static void main(String[]args)
	{
		SInfo s1 = new SInfo();
		      s1.get(101,12,"Rajashri","Karad");
		      s1.show();
	}
}			