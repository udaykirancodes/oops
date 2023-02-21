package math;

public class Multiply
{
	public static int multiply(int ...n)
	{
		int p=1;
		for(int i=0;i<n.length;i++)
			p=p*n[i];
		return p;
	}

	public static double multiply(double ...n)
	{
		double p=1;
		for(int i=0;i<n.length;i++)
			p=p*n[i];
		return p;
	}
}