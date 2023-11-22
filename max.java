import java.util.*;
class max{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int a,b,c,d,e;
	int m,n;
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	d=sc.nextInt();
	e=sc.nextInt();
	m=Integer.MIN_VALUE;
	n=Integer.MAX_VALUE;
	m=Math.max(m,a);
	n=Math.min(n,a);
	m=Math.max(m,b);
	n=Math.min(n,b);
	m=Math.max(m,c);
	n=Math.min(n,c);
	m=Math.max(m,d);
	n=Math.min(n,d);
	m=Math.max(m,e);
	n=Math.min(n,e);
	System.out.println("Largest : "+m);
	System.out.println("Smallest : "+n);
}
}
