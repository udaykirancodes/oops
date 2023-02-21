import java.util.Scanner;
import static java.lang.Math.*;
//method signature must be same to override
abstract class Shape
{
	abstract double getArea();
	abstract double getVolume();
}

class Square extends Shape
{
	double s;
	Square(double s)
	{
		this.s=s;
	}
	double getArea(){return s*s;}//we can just write static methods getArea(r)//change the signature in abstract class also
	double getVolume(){return 0;}
}

class Circle extends Shape
{
	double r;
	Circle(double r)
	{
		this.r=r;
	}
	double getArea(){return PI*r*r;}
	double getVolume(){return 0;}
}
class Cube extends Shape
{
	double s;
	Cube(double s)
	{
		this.s=s;
	}
	double getArea(){return 6*s*s;}
	double getVolume(){return s*s*s;}
}
class Sphere extends Shape
{
	double r;
	Sphere(double r)
	{
		this.r=r;
	}
	double getArea(){return 4*PI*r*r;}
	double getVolume(){return 4.0/3*PI*r*r*r;}
}

class AreaVolume
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);

		System.out.println("Enter side of square");
		Square sq=new Square(in.nextDouble());
		
		System.out.println("Enter radius of circle");
		Circle ci=new Circle(in.nextDouble());

		System.out.println("Enter side of cube");
		Cube cu=new Cube(in.nextDouble());

		System.out.println("Enter radius of sphere");
		Sphere sp=new Sphere(in.nextDouble());
		
		System.out.println("Circle : area = "+ci.getArea()+"  volume = "+ci.getVolume());
		System.out.println("Square : area = "+sq.getArea()+"  volume = "+sq.getVolume());
		System.out.println("Cube   : area = "+cu.getArea()+"  volume = "+cu.getVolume());
		System.out.println("Sphere : area = "+sp.getArea()+"  volume = "+sp.getVolume());
	}
}//here we can use runtime polymorphism by assignig objects to reference variable of Shape (Shape s)