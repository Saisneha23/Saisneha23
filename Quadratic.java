import java.util.*;
import java.lang.*;
class Quadratic{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int a,b,c,d;
	double r1,r2;
	double s;
	System.out.print("A = ");
	a=sc.nextInt();
	System.out.print("B = ");
	b=sc.nextInt();
	System.out.print("C = ");
	c=sc.nextInt();
	d=(b*b-4*a*c);
	r1=((-b+d)/2*a);
	r2=((-b-d)/2*a);
	s=Math.sqrt(d);
	if(d<0)
	{
		System.out.println("Imaginary Roots :");
		System.out.println("Real Part : "+(-b/2*a)+"  Imaginary Part : +i"+(s/2*a));
		System.out.println("Real Part : "+(-b/2*a)+"  Imaginary Part : -i"+(s/2*a));
	}
	else if(d==0)
	{
		System.out.println("Equal Roots :");
		System.out.println("Real Roots are : "+r1+" "+r2);
	} 
	else
	{
		System.out.println("Real Roots :");
		System.out.println("Real Part : "+r1+"  Imaginary Part : 0");
		System.out.println("Real Part : "+r2+"  Imaginary part : 0");
	}
}
}
