import java.util.Scanner;

class InsertionSort
{
	public static void main(String[] args)
	{
	Scanner in=new Scanner(System.in);
	int num[],n,i,j,temp;
	System.out.println("How many numbers you want to enter");
	n=in.nextInt();
	num=new int[n];
	System.out.println("Enter "+n+" numbers");
	for(i=0;i<n;i++)
		num[i]=in.nextInt();
	for(i=1;i<n;i++)
	{
		for(j=i-1;j>0;j--)
		{
			if(num[j]<num[j-1])
			{
				temp=num[j];
				num[j]=num[j-1];
				num[j-1]=temp;
			}
		}
	}
	System.out.println("Soted elemests are ");
	for(int k=0;k<n;k++)
		System.out.print(num[k]+"  ");

	}
}