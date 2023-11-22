import java.util.*;
class Calc{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in); 
	int a,b;
	int res=0;
	System.out.println("A : ");
	a=sc.nextInt();
	System.out.println("B : ");
	b=sc.nextInt();
	char ch;
	ch=sc.next().charAt(0);
	switch(ch){
		case '+':
			res = a+b;
			break;
		case '-':
			res = a-b;
			break;
		case '*': 
			res = a*b;
			break;
		case '/': 
			res = a/b;
			break;
	}
	System.out.println("" + res);
}
}
