import java.util.*;

class Binary
{
	public static void main(String arg[])
	{
		int a[],start,end,mid,key,n,i;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of numbers");
		n=in.nextInt();
		a=new int[n];
		System.out.println("Enter "+n+" sorted numbers");//use Arrays.sort(a) to sort a[]
		Arrays.sort(a);
		for(i=0;i<n;i++)
			a[i]=in.nextInt();
		System.out.println("Enter the number to search");
		key=in.nextInt();

		start=0;
		end=n-1;

		while(start<=end)
		{
			mid=(start+end)/2;
			if(key==a[mid])
			{
				System.out.println(key+" found at location "+(mid+1));
				break;
			}
			else if(key<a[mid])
				end=mid-1;
			else if(key>a[mid])
				start=mid+1;
		}

		if(end<start)
			System.out.println(key+" not found");
	}
} 