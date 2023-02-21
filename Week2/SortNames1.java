import java.util.Scanner;
import java.util.Arrays;

class SortNames1
{
	public static void main(String[] args)
	{
		int n;
		System.out.println("How many Names you want to enter");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		System.out.println("Enter names");
		String name[]=new String[n];
		for(int i=0;i<n;i++)
			name[i]=in.next();

		Arrays.sort(name);

		System.out.println("\nSorted names are :");
		for(int i=0;i<n;i++)
			System.out.println(name[i]);
	}
}