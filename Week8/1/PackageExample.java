import mypack.*;
import java.util.Scanner;

class PackageExample
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);

		System.out.println("Enter radius of circle");
		Circle ci=new Circle(in.nextDouble());
		System.out.println("area of circle "+ci.getArea());
		
		System.out.println("Enter radius of sphere");
		Sphere sp=new Sphere(in.nextDouble());
		System.out.println("Sphere :\narea "+sp.getArea()+"  volume "+sp.getVolume());

		System.out.println("Enter side of Square");
		Square sq=new Square(in.nextDouble());
		System.out.println("area of square "+sq.getArea());	

		System.out.println("Enter side of cube");
		Cube cu=new Cube(in.nextDouble());
		System.out.println("Cube :\narea "+cu.getArea()+"  volume "+cu.getVolume());
	}
}