import java.util.Scanner;

class UniqueNumbers
{
	public static void main(String args[])
	{
		int i,j,k,pc,temp;
		int num[]=new int[5];
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 5 numbers");

		for(i=0;i<5;)  // i counts the numbers entered
		{
			temp=in.nextInt();
			if(temp>=10&&temp<=100)
				{
					num[i]=temp;
					for(j=0;j<=i;j++)
					{
						for(pc=0,k=0;k<j;k++)
						{
							if(num[k]==num[j]) 
								pc++;
						}
						if(pc==0) 
						{
							System.out.print(num[j]+" ");
						}
					}
					System.out.println();//for new line
					i++;
				}
			else
				System.out.println("Enter a number between 10 and 100 only");	
		}
	}
}