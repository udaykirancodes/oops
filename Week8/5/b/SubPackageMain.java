import static math.Multiply.*;
import static math.constants.Value.*;
import java.util.Scanner;

class SubPackageMain
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);

		System.out.println("Enter radius of circle");
		double r=in.nextDouble();
		System.out.println("area of circle "+multiply(PI,r,r));		
	}
}