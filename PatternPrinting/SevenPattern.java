import java.io.*;
class SevenPattern
{
	public static void main(String[]args)
	{
		for(int i = 1; i <= 7; i++)
		{
			for(int j = 1; j <= 5; j++)
			{
				if(i == 1 || j == 7-i)
				{
					System.out.print("+");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
