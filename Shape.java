import java.util.*;
class Shape{
	Shape(){System.out.println("Base class");}
}
class Circle extends Shape{
	double radius;
	Circle(double r){ radius=r;}
	void getArea(int radius){
		System.out.println("Area of Circle : "+(3.14*radius*radius));
	}
	void getPerimeter(int radius){
		System.out.println("Perimeter of a Circle"+(2*3.14*radius));
	}
}
class Rectangle extends Shape{
	int l,b;
	Rectangle(int length,int breadth){ l=length; b=breadth;}
	void getArea(int l,int b){
		System.out.println("Area of Rectangle : "+l*b);
	}
	void getPerimeter(int l,int b){
		System.out.println("Perimeter of Rectangle: "+2*(l+b));
	}
}
class Square extends Shape{
	int side;
	Square(int s){ side= s;}
	void getArea(int side){
		System.out.println("Area of Square:"+side*side);
	}
	void getPerimeter(int side){
		System.out.println("Peimeter of Square :"+4*side);
	}
}
class Solution{
	public static void main(String args[])
	{
		double radius;
		int l,b,side;
		Scanner sc=new Scanner(System.in);
		System.out.print("Radius of Circle:");
		radius=sc.nextInt();
		Circle c=new Circle(radius);
		System.out.print("length of Rectangle:");
		l=sc.nextInt();
		System.out.print("length of Rectangle:");
		b=sc.nextInt();
		Rectangle r=new Rectangle(l,b);
		System.out.print("side of Square:");
		side=sc.nextInt();
		Sqaure s=new Square(side);
	}
}
