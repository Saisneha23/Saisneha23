import java.util.*;
class Shape{
	Shape(){System.out.println("Base class");}
}
class Circle extends Shape{
	int radius;
	Circle(int r){ radius=r;}
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
	int s;
	Square(int side){ s= side;}
	void getArea(int s){
		System.out.println("Area of Square:"+s*s);
	}
	void getPerimeter(int s){
		System.out.println("Perimeter of Square :"+4*s);
	}
}
class Solution{
	public static void main(String args[])
	{
		int radius;
		int l,b,side;
		Scanner sc=new Scanner(System.in);
		System.out.print("Radius of Circle:");
		radius=sc.nextInt();
		Circle c=new Circle(radius);
		c.getArea(radius);
		c.getPerimeter(radius);
		System.out.print("length of Rectangle:");
		l=sc.nextInt();
		System.out.print("Breadth of Rectangle:");
		b=sc.nextInt();
		Rectangle r=new Rectangle(l,b);
		r.getArea(l,b);
		r.getPerimeter(l,b);
		System.out.print("side of Square:");
		side=sc.nextInt();
		Square s=new Square(side);
		s.getArea(side);
		s.getPerimeter(side);
	}
}
