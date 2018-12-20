import java.util.Scanner;

public class Vowels 
{
	public static void main(String[] args)
	{
		int vowels=0,consonents=0,spaces=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the line:");
		String c=s.next();
		c=c.toLowerCase();
		for(int i=0;i<c.length();++i)
		{
			char c1=c.charAt(i);
			if(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u')
			{
				++vowels;
				
			}
			else if((c1>='a' && c1<='z'))
			{
				++consonents;
			}
			else if(c1 == ' ')
			{
				++spaces;
			}
			System.out.println("vowles:"+vowels);
			System.out.println("consonents:"+consonents);
			System.out.println("Spaces:"+spaces);
		}
		
	}
}
