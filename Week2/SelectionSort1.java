import java.util.Scanner;

class SelectionSort
{
	public static void main(String[] args)
	{
	Scanner in=new Scanner(System.in);
	int num[],n,min,i,j,temp;
	System.out.println("How many numbers you want to enter");
	n=in.nextInt();
	num=new int[n];
	System.out.println("Enter "+n+" numbers");
	for(i=0;i<n;i++)
		num[i]=in.nextInt();
	for(i=0;i<n-1;i++)
	{
		min=num[i];
		for(j=i+1;j<n;j++)
			if(num[j]<min)
			{
				temp=num[j];
				num[j]=num[j+1];
				num[j+1]=temp;
			}

	}
	System.out.println("Soted elemests are ");
	for(i=0;i<n;i++)
		System.out.print(num[i]);
	}
}