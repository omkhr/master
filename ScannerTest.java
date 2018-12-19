import java.util.Scanner;

public class ScannerTest 
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		//System.out.println("Enter the number");
		//int i=s.nextInt();
		//System.out.println("Value:"+i);
		System.out.println("Enter the character:");
		char c= s.next().charAt(0);
		System.out.println("character:"+c);
		
	}
	
}
