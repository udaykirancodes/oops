import java.io.*;
import java.util.Scanner;
//import java.lang.Math;    //compiles without this statement also. Not needed if we use "Math.sqrt()"

class Quadratic
{
	public static void main(String arg[])
	{
		int a,b,c,d;
		double y1,y2;
		Scanner in=new Scanner(System.in);
		System.out.println("Entrer a,b and c");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		d=b*b-4*a*c;
		y1=-b/(2.0*a);
		if(d>0)
		{
			y2=Math.sqrt(d)/(2.0*a);		//we can just use sqrt() if we write  "import static java.lang.Math.*;"
			System.out.println("x1 = "+(y1+y2)+" x2 = "+(y1-y2));
		}
		else if(d<0)
		{
			y2=Math.sqrt(-d)/(2.0*a);
			System.out.println(" x1 = "+y1+" + i "+y2+" x2 = "+y1+" - i "+y2);
		}
		else if(d==0) System.out.println("x1="+y1+" x2="+y1);

	}
}
