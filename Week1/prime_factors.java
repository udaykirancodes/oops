import java.util.*;
import java.lang.*;

class prime_factors extends Main{
	private int n;
	public void setn()
	{
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	}
	public void print()
	{
		System.out.println("Printing prime Factors"+" ");
		int i;
		for(i=2;i<n;i++)
		{
			if(n%i==0 && prime(i))
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	
	public boolean prime(int n)
	{
		int i;
		for(i=2;i<n;i++)
		{	
			if(n%i==0)
			{
				break;
			}
		}
		if(i==n)
		{
			return true;
		}
		else{
			return false;
		}
			
	}
}