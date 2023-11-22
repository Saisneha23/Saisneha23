import java.util.*;
class value{
	int a;
	value(int x){a=x;}
	void callvalue(int a)
	{
		System.out.println(a);
		System.out.println("Calll by Value");
	}
}
class object{
	int val;
	object(){}
	void callObject(object obj)
	{
		System.out.println(obj.val);
		System.out.println("Call by object");
	}
}
class LAB53
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int x,val;
		x=sc.nextInt();
		value v=new value(x);
		v.callvalue(x);
		val=sc.nextInt();
		object obj=new object();
		obj.val=val;
		obj.callObject(obj);
	}
}
