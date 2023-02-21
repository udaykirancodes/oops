package Calculator;

public class Add
{
	public static int add(int ...n)
	{
		int sum=0;
		for(int i=0;i<n.length;i++)
		{
			sum=sum+n[i];
		}
		return sum;
	}
}