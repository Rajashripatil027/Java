import java.io.*;
class VowelConsonantCount
{
	public static void main(String[]args)
	{
		String str = "Automation";
		
		int vowels = 0, consonant = 0;
		for(char c :str.toCharArray0)
		{
			if("aeiouAEIOU",isLetter(c) != -1)
			{
				vowels++;
			}
			else if(Character.isLetter(c))
			{
				consonant++;
			}
		}
	System.out.println("Vowels = "+vowels+",Consonant = "+consonant);
	}
}