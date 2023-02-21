import java.util.Scanner;

class Circle
{
	public static void main(String[] args)
	{
	Scanner in=new Scanner(System.in);
	double r;
	System.out.println("Enter the radius");
	r=in.nextDouble();
	System.out.println("Area = "+circleArea(r));
	System.out.println("Perimeter = "+circlePerimeter(r));
	}

	static double circleArea(double r) {return Math.PI*r*r;}
	static double circlePerimeter(double r) {return Math.PI*2*r;}
}