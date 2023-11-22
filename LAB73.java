import java.util.*;
interface Payable{
	double getAmount();
}
class Invoice implements Payable{
	double goodsAmount;
	double discount;
	double tax;
	Invoice(double gA,double dis,double tax){ goodsAmount=gA; discount=dis; this.tax=tax;
	System.out.println("Goods Amount : "+goodsAmount+" Discount : "+discount+" Tax : "+tax);
	}
	public double getAmount()
	{
		return goodsAmount-(goodsAmount*discount)+tax;
	}
}
class Employee implements Payable{
	int no_of_hours,overtime;
	double hourlyWage,overtime_wage;
	Employee(double h,int n,int o){ hourlyWage=h; no_of_hours=n; overtime=o; }
	public double getAmount(){
		return no_of_hours*hourlyWage+(overtime*1.5*hourlyWage);
	}
}
class LAB73{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double goodsAmount,discount,tax;
		int n,overtime;
		double hourlyWage,overtime_wage;
		System.out.println("Invoice Details :");
		goodsAmount=sc.nextDouble();
		discount=sc.nextDouble();
		tax=sc.nextDouble();
		Invoice i=new Invoice(goodsAmount,discount,tax);
		System.out.println("Amount to be paid to Invoice : "+i.getAmount());
		System.out.println("Employee Details : ");
		n=sc.nextInt();
		overtime=sc.nextInt();
		hourlyWage=sc.nextDouble();
		Employee e=new Employee(hourlyWage,n,overtime);
		System.out.println("Amount to be paid to Employee : "+e.getAmount());
	}
}
