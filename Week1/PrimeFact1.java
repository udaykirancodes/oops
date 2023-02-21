import java.util.Scanner;

class PrimeFact2
{
	public static void main(String args[])
	{
		int num,i;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter an integer");
		num=in.nextInt();

		i=2;
		while(i<=num)
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
				num=num/i;
			}
			else i++;
		}
		System.out.println();
	}
}