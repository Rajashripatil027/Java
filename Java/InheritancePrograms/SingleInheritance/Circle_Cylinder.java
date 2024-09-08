import java.io.*;
class parent 
{
	 float r;
	public void get(float r)
	{
		this.r = r;
	}
	public void area()
	{
		float ar;
		ar = 3.14f*r*r;
		System.out.println("Area Of Circle = "+ar);
	}
}
class Child extends parent
{
	int h;
	public void get1(int h)
	{
		this.h = h;
	}
	public void volume()
	{
		float vol;
		vol = 3.14f*r*r*h;
		System.out.println("Volume Of Cylinder = "+vol);
	}
}
class Circle_Cylinder
{
		public static void main(String[]args)
		{
			Child c1 = new Child();
				c1.get(3.5f);
				c1.area();
			
				c1.get1(34);
				c1.volume();
		}
}
			
	