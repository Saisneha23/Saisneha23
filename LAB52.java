import java.util.*;
class circle{
	double radius;
	circle(double r){radius=r;}
	double circleArea(double radius){
		return Math.PI*radius*radius;
	}
	double circlePerimeter(double radius){
		return Math.PI*2*radius;
	}
}
class LAB52{
	public static void main(String args[])
	{
		double radius;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Radius:");
		radius=sc.nextDouble();
		circle c=new circle(radius);
		System.out.println("Area : "+ c.circleArea(radius) + " Perimeter : " + c.circlePerimeter(radius));
	}
}
