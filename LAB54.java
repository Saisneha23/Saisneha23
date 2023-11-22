import java.util.*;
class Account{
	double bal;
	String Acct_Name,Acct_Address;
	int Acct_no;
	Account(String acct_Name,int acct_no,String acct_Address,double balance)
	{
		System.out.println("Ensure balance must be greater than 0.0");
		Acct_Name=acct_Name;
		Acct_no=acct_no;
		Acct_Address=acct_Address;
		bal=balance;
		System.out.println("Acct_Name :"+Acct_Name+" Acct_no : "+Acct_no+" Acct_Addres :"+Acct_Address+" bal :"+bal);
	}
	double credit(double amt)
	{
		return bal+=amt;
	}
	double debit(double amt)
	{
		if(bal>amt) return bal-=amt;
		else return 0;
	}
}
class LAB54{
	public static void main(String args[])
	{
		double bal;
		String Acct_Name,Acct_Address;
		int Acct_no;
		double amt;
		Scanner sc=new Scanner(System.in);
		System.out.print("Account name : ");
		Acct_Name=sc.next();
		System.out.print("Account no : ");
		Acct_no=sc.nextInt();
		System.out.print("Account Address : ");
		Acct_Address=sc.next();
		System.out.print("Account bal : ");
		bal=sc.nextDouble();
		Account acc=new Account(Acct_Name,Acct_no,Acct_Address,bal);
		System.out.println("Enter amt to be credit : ");
		amt=sc.nextDouble();
		System.out.println("current balance(after crediting) : "+acc.credit(amt));
		System.out.print("Enter amt to be debit : ");
		amt=sc.nextDouble();
		System.out.print("current balance(after debiting) : "+acc.debit(amt));
	}
}
