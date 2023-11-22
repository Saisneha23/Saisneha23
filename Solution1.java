import java.util.*;
class Person{
	Person(){}
}
class Student extends Person{
	String name;
	String address;
	int grade;
	String [] c=new String[30];
	int [] g=new int[30];
	int size=0;
	Student(String sname,String saddress){ name=sname; address=saddress; System.out.println("name : "+name+" address : "+address);}
	int AddCourseGrade(String course,int grade){
		c[size]=course;
		g[size]=grade;
		size++;
		return size;
	}
	void getCourse(){
		for(int i=0;i<size;i++){
			System.out.println(c[i]+"-->"+g[i]);
		}
	}
	void getAvgGrade(){
		int gradeSum=0;
		for(int i=0;i<size;i++){
			gradeSum+=g[i];
		}
		int avg=gradeSum/size;
		System.out.println("Average grade:" + avg);
	}
}
class Teacher extends Person{
	String name;
	String address;
	String [] c=new String[5];
	int size=0;
	Teacher(String tname,String taddress){ name=tname; address=taddress; System.out.println("name : "+name+" address : "+address);}
	int addCourse(String course){
		c[size]=course;
		size++;
		return size;
	}
	void removeCourse(String course){
		for(int i=0;i<size;i++){
			if(c[i].equals(course))
			{
				break;
			}
			else
				System.out.println(c[i]);
		}
	}
}
class Solution1{
	public static void main(String args[])
	{
		String sname,saddress,tname,taddress,scourse,tcourse;
		int grade;
		int n,m;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student name :");
		sname=sc.next();
		System.out.print("Enter Student Address :");
		saddress=sc.next();
		System.out.print("Enter no. of courses taken by students:");
		n=sc.nextInt();
		Student s=new Student(sname,saddress);
		System.out.print("Enter courses and garde of students:");
		for(int i=0;i<n;i++)
		{
			scourse=sc.next();
			grade=sc.nextInt();
			s.AddCourseGrade(scourse,grade);
		}
		s.getCourse();
		s.getAvgGrade();
		System.out.print("Enter Teacher name :");
		tname=sc.next();
		System.out.print("Enter Teacher Address :");
		taddress=sc.next();
		System.out.print("Enter no. of courses taken by Teacher:");
		m=sc.nextInt();
		Teacher t=new Teacher(tname,taddress);
		System.out.println("Enter courses of Teacher:");
		for(int i=0;i<m;i++)
		{
			if(m>=5)
			{
				System.out.println("Invalid no. of courses");
				break;
			}
			tcourse=sc.next();
			t.addCourse(tcourse);
		}
		if(m<5)
		{
			System.out.print("Enter the course to be removed:");
			tcourse=sc.next();
			t.removeCourse(tcourse);
		}
	}
}
