import java.util.Scanner;

class NewSort
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
	for(i=0;i<n-1;i++)
	{
		for(j=i+1;j<n;j++)
			if(num[j]<num[i]) 
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
	}
	System.out.println("Soted elemests are ");
	for(int k=0;k<n;k++)
		System.out.print(num[k]+"  ");
	}
}