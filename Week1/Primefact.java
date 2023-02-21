import java.util.Scanner;

class Primefact
{
	public static void main(String arg[])
	{
		int num,fact,factcount,i;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter an integer");
		num=in.nextInt();

		for(fact=2 ; fact<=num ; fact++)
		{
			if(num%fact==0)
			{
				for(i=1,factcount=0 ; i<=fact/2; i++)
				{
					if(fact%i==0)
						factcount++;
				}
				if(factcount==1)
				{
				System.out.print(fact+" ");
				num=num/fact;
				fact--;
				}

			}
		}
	}
}