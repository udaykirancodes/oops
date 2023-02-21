package mypack;

public class Cube
{
	double s;
	public Cube(double s)
	{
		this.s=s;
	}
	public double getArea(){return 6*s*s;}
	public double getVolume(){return s*s*s;}
}