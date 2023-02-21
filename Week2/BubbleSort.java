import java.util.Scanner;

{
	public static void main(String arg[])
	{
		int a[],n,i,j,temp;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of numbers");
		n=in.nextInt();
		a=new int[n];
		System.out.println("Enter "+n+" numbers");
		for(i=0;i<n;i++)
			a[i]=in.nextInt();

		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}

		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}