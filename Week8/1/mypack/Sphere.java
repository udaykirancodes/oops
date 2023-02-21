package mypack;
import static java.lang.Math.*;

public class Sphere
{
	double r;
	public Sphere(double r)
	{
		this.r=r;
	}
	public double getArea(){return 4*PI*r*r;}
	public double getVolume(){return 4.0/3*PI*r*r*r;}
}