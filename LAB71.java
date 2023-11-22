import java.util.*;
abstract class Shape{
	abstract double getArea();
	abstract double getVolume();
}
class Square extends Shape{
	double side;
	Square(double s){ side=s; }
	double getArea(){
		return side*side;
	}
	double getVolume(){
		return -1;
	}
}
class Circle extends Shape{
	double radius;
	Circle(double r){ radius=r; }
	double getArea(){
		return Math.PI*radius*radius;
	}
	double getVolume(){
		return -1;
	}
}
class Cube extends Shape{
	double side;
	Cube(double s){ side=s; }
	double getArea(){
		return 6*side*side;
	}
	double getVolume(){
		return side*side*side;
	}
}
class Sphere extends Shape{
	double radius;
	Sphere(double r){ radius=r; }
	double getArea(){
		return 4*Math.PI*radius*radius;
	}
	double getVolume(){
		return (4/3)*Math.PI*radius*radius*radius;
	}
}
class LAB71{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double side;
		double radius;
		System.out.print("Enter the side of Square and cube:");
		side=sc.nextDouble();
		System.out.print("Enter the radius of Circle and Sphere:");
		radius=sc.nextDouble();
		Square s=new Square(side);
		System.out.println("Area of Square : "+s.getArea());
		System.out.println("Volume of Square : "+s.getVolume());
		Circle c=new Circle(radius);
		System.out.println("Area of Circle : "+c.getArea());
		System.out.println("Volume of Circle : "+c.getVolume());
		Cube r=new Cube(side);
		System.out.println("Area of Cube : "+r.getArea());
		System.out.println("Volume of Cube : "+r.getVolume());
		Sphere t=new Sphere(radius);
		System.out.println("Area of Sphere : "+t.getArea());
		System.out.println("Volume of Sphere : "+t.getVolume());
	}
}
