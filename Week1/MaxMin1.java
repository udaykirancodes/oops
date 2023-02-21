import java.util.Scanner;
import java.util.Arrays;

class MaxMin1
{
	public static void main(String arg[])
	{
		int num[]=new int[5],max,min;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter five integers");
		
		for(int i=0;i<5;i++)
			num[i]=in.nextInt();
		Arrays.sort(num);
		System.out.println("maximum = "+num[4]+"   minimum = "+num[0]);
	}
}