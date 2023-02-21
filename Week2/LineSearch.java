import java.util.Scanner;

class LineSearch
{
	public static void main(String arg[])
	{
		int a[],i,key,n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of numbers");
		n=in.nextInt();
		a=new int[n];
		System.out.println("Enter "+n+" numbers");
		for(i=0;i<n;i++)
			a[i]=in.nextInt();
		System.out.println("Enter the number to search");
		key=in.nextInt();

		for(i=0;i<n;i++)
		{
			if(a[i]==key)
			{
				System.out.println(key+" found at position "+(i+1));
				break;
			}
		}

		if(i==n)
			System.out.println(key+" not found");
	}
}