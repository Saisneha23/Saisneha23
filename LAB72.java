import java.util.*;
abstract class Employee{
	abstract double getAmount();
}
class HourlyEmployee extends Employee{
	int no_of_hours;
	double hourlyWage;
	HourlyEmployee(double h,int n){ hourlyWage=h; no_of_hours=n; }
	double getAmount(){
		return no_of_hours*hourlyWage;
	}
}
class WeeklyEmployee extends Employee{
	int n;
	double WeeklyWage;
	WeeklyEmployee(double w,int no_of_weeks){ WeeklyWage=w; n=no_of_weeks; }
	double getAmount(){
		return n*WeeklyWage;
	}
}
class LAB72{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		double Hour_wage,Week_wage;
		System.out.print("Enter no. of hours worked by HourlyEMployee  : ");
		n1=sc.nextInt();
		System.out.println("Enter Hourly wage of HourlyEMployee : ");
		Hour_wage=sc.nextDouble();
		HourlyEmployee h=new HourlyEmployee(Hour_wage,n1);
		System.out.println("Salary of HourlyEMployee : "+ h.getAmount());
		System.out.print("Enter no. of hours worked by WeeklyEMployee  : ");
		n2=sc.nextInt();
		System.out.println("Enter Weekly wage of HourlyEMployee : ");
		Week_wage=sc.nextDouble();
		WeeklyEmployee w=new WeeklyEmployee(Week_wage,n2);
		System.out.println("Salary of WeeklyEMployee : "+ w.getAmount());
	}
}
