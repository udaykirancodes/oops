import java.util.Scanner;

class MaxMin
{
	public static void main(String arg[])
	{
		int num[]=new int[5],i,max,min;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter five integers");
		
		for(i=0;i<5;i++)
			num[i]=in.nextInt();

		max=num[0];min=num[0];
		for(i=0;i<5;i++)
		{
			if(num[i]>max)
				max=num[i];
			if(num[i]<min)
				min=num[i];
		}

		System.out.println("maximum = "+max+"   minimum = "+min);
	}
}