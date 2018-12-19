import java.util.Scanner;

public class BankApplication 
{
	public static void main(String[] args)
	{
		BankAccount b=new BankAccount("omi","909");
		b.showMenu();
	}
}

class BankAccount
{
	String custname;
	String custid;
	int balance;
	int previoustransaction;
	
	BankAccount(String cname,String cid)
	{ 
		custname=cname;
		custid=cid;
	}
	
	void deposit(int amount)
	{
		if(amount!=0)
		{
			balance=amount;
			previoustransaction=amount;
		}
	}
	
	void withDraw(int amount)
	{
		if(amount!=0)
		{
			balance=balance - amount;
			previoustransaction=-amount;
		}
	}
	
	void getPreviousTransaction()
	{
		if(previoustransaction > 0)
		{
			System.out.println("Amount Deposited:"+previoustransaction);
		}
		else if(previoustransaction < 0)
		{
			System.out.println("Amount withdrawn:"+Math.abs(previoustransaction));
		}
		else
		{
			System.out.println("Transaction not performed");
		}
	}
	
	void showMenu()
	{
		char option='\0';
		Scanner s=new Scanner(System.in);
		System.out.println("Welcome:"+custname);
		System.out.println("Your id is:"+custid);
		System.out.println("\n");
		System.out.println("A. Check balance");
		System.out.println("B. Withdraw");
		System.out.println("C. Deposit");
		System.out.println("D. Previous Transaction");
		System.out.println("E. Exit");
		
		do
		{
			System.out.println("=========================");
			System.out.println("Enter an option:");
			System.out.println("=========================");
			option=s.next().charAt(0);
			System.out.println("\n");
			
			switch(option)
			{
			case 'A':
				System.out.println("------------");
				System.out.println("Balance:"+balance);
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("Enter the amount to withdraw:");
				System.out.println("-------------------");
				int a=s.nextInt();
				withDraw(a);
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("Enter the amount to Deposit:");
				System.out.println("----------------");
				int amount=s.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("--------------------");
				getPreviousTransaction();
				System.out.println("\n");
				break;
				
			case 'E':
				System.out.println("*****************");
				break;
			
			default:
				System.out.println("Thanku for using our services.");
				break;
			}
			
			
		}while(option!='E');
		
	}
}