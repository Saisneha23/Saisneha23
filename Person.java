import java.util.*;
class Person{
	String name;
	String address;
	Person(String N,String add){name=N;address=add;}
}
class Student extends Person{
	String course;
	int grade;
	String [] c=new String[30];
	int [] g=new int[30];
	int size=0;
	Student(String c,int g){ course=c; grade=g;}
	void AddCourseGrade(String course,int grade){
		c[size]=course;
		g[size]=grade;
		size++;
		return size;
	}
	void getCourse(){
		for(int i=0;i<size;i++){
			System.out.println(course[i]+"-->"grade[i]);
		}
	}
	void getAvgGrade(){
		int gradeSum=0;
		int avg;
		for(int i=0;i<size;i++){
			gradeSum+=grade[i];
			count++;
		}
		avg=gradeSum/count;
		System.out.println("Average grade:" + avg);
	}
}
class Teacher extends Person{
	String course;
	String [] c=new String[5];
	int size=0;
	Teacher(String c){ course=c; }
	void addCourse(String course){
		c[size]=course;
		size++;
		return size;
	}
	void removeCourse(String course){
		for(int i=0;i<size;i++){
			if(course[i]==course)
				continue;
			else
				System.out.println(course[i]);
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
		System.out.print("Enter courses and garde of students:");
		Student s=new Student(sname,saddress);
		for(int i=0;i<n;i++)
		{
			scouse=sc.next();
			grade=sc.next();
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
		System.out.print("Enter courses of Teacher:");
		Teacher t=new Teacher(tname,taddress);
		for(int i=0;i<m;i++)
		{
			tcourse=sc.next();
			t.addCourse(tcourse);
		}
		System.out.print("Enter the course to be removed:");
		tcourse=sc.next();
		t.removeCourse(tcourse);
	}
}
