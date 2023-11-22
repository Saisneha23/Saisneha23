import java.util.*;
class person{
	static String name;
	static String id;
	static String branch;
	static person(Sting name,String id,String branch)
	{
		this.name=name;
		this.id=id;
		this.branch=branch;
		System.out.println("Name : "+this.name+" Id : "+this.id+" Branch : "+this.branch);
	}
}
class student extends person{
	student(String name,String id,String branch)
	{
		super(name,id,branch);
	}
}
class Sample{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String name;
		String id;
		String branch;
		name=sc.next();
		id=sc.next();
		branch=sc.next();
		student s=new student(name,id,branch);
	}
}
