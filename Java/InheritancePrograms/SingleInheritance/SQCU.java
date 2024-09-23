import java.io.*;
class Squre
{
	int Num1,Num2;
	public void get(int Num1,int Num2)
	{
		this.Num1 = Num1;
		this.Num2 = Num2;
	}
	public void Squ()
	{
		int sq;
		sq = Num1*Num1;
		System.out.println("Squre = "+sq);
	}
}
class Cube extends Squre
{
	public void Cub()
	{
		int cu;
		cu = Num2*Num2*Num2;
		System.out.println("Cube = "+cu);
	}
}
class SQCU
{
	public static void main(String[]args)
	{
		Cube c1 = new Cube();
		     c1.get(2,4);
		     c1.Squ();
		     c1.Cub();
	}
}