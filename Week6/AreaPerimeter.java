import java.util.Scanner;
import static java.lang.Math.*;
//Example of runtime polymorphism

class Shape
{
	double getArea(){return 0;}
	double getPerimerter(){return 0;}
}
//making abstract is better here

class Circle extends Shape
{
	double r;
	Circle(double r)
	{
		this.r=r;
	}
	double getArea(){return PI*r*r;}
	double getPerimerter(){return 2*PI*r;}
}

class Square extends Shape
{
	double s;
	Square(double s)
	{
		this.s=s;
	}
	double getArea(){return s*s;}
	double getPerimerter(){return 4*s;}
}

class Rectangle extends Shape
{
	double l,b;
	Rectangle(double l,double b)
	{
		this.l=l;
		this.b=b;
	}
	double getArea(){return l*b;}
	double getPerimerter(){return 2*(l+b);}
}

class AreaPerimeter
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		Shape s;

		System.out.println("Enter radius of circle");
		s=new Circle(in.nextDouble());
		System.out.println("Circle : area = "+s.getArea()+"  perimeter = "+s.getPerimerter());

		System.out.println("Enter side of square");
		s=new Square(in.nextDouble());
		System.out.println("Square : area = "+s.getArea()+"  perimeter = "+s.getPerimerter());

		System.out.println("Enter length and breadth of rectangle");
		s=new Rectangle(in.nextDouble(),in.nextDouble());
		System.out.println("Rectangle : area = "+s.getArea()+"  perimeter = "+s.getPerimerter());
		//so here compiler calls the methods based on th object being referred(the actual object being referred)
		//doesn't happen in case of variables. i.e., variable choosing depends on reference variable
	}
}