import java.util.Scanner;
import static java.lang.Math.*;
import intpack.*;//even if it is not compiled the compiler compiles it while importing//thats why .java files should have same name as public class in a file

class Circle implements Measurable
{
	double r;
	public Circle(double r)
	{
		this.r=r;
	}
	public double getArea(){return PI*r*r;}
}

class InterfacePackageMain
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);

		System.out.println("Enter radius of circle");
		Circle c=new Circle(in.nextDouble());
		System.out.println("area of circle "+c.getArea());		
	}
}