package org.shapes;
import java.util.Scanner;
import static java.lang.Math.*;

class Circle//No need of public, as we are accessing from the same package
{
	double r;
	public Circle(double r)//no need of public
	{
		this.r=r;
	}
	public double getArea(){return PI*r*r;}// no need of public
}

class Square
{
	double s;
	public Square(double s)
	{
		this.s=s;
	}
	public double getArea(){return s*s;}
}

class Triangle
{
	double h,b;
	public Triangle(double h,double b)
	{
		this.h=h;
		this.b=b;
	}

	public double getArea()
	{
		return 0.5*h*b;
	}
}

class PackageExample1
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);

		System.out.println("\nEnter the radius of circle");
		Circle c=new Circle(in.nextDouble());
		System.out.println("area of circle "+c.getArea());

		System.out.println("\nEnter radius of sqaure");
		Square s=new Square(in.nextDouble());
		System.out.println("area of square "+s.getArea());

		System.out.println("\nEnter height,base of triangle");
		Triangle t=new Triangle(in.nextDouble(),in.nextDouble());
		System.out.println("area of triangle "+t.getArea());
	}
}