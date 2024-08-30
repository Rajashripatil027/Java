import java.io.*;
class pattern
{
	public void loop()
	{
		for(int i = 1; i <= 5; i++)
		   {
			for(int j = 1; j <= 5; j++)
			   {
				System.out.print(j);
			    }
				System.out.println();
		  }
	}
}
class demo1
{
		public static void main(String[]args) 
		{
			pattern p1 = new pattern();
				p1.loop();
		}

}