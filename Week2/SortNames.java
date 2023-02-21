import java.util.Scanner;

//use Arrays.sort(arrayname) to sort.

class SortNames
{
	public static void main(String[] args) {
		System.out.println("How many Names you want to enter");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		//in.nextLine();		//to consume the leftover \n character.  but not needed as we used next() only
		int i,j;
		String Names[]=new String[n];
		String temp=new String();
		System.out.println("Enter "+n+" names");
		for(i=0;i<n;i++)
			Names[i]=new String(in.next());//or in.next(); since string can directly take literals
		//next takes upto space
		//nextLine() takes upto \n i.e., Enter

		//implementing Bubble sort
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-1-i;j++)
			{
				if(Names[j].compareTo(Names[j+1])>0)
				{
					temp=Names[j];
					Names[j]=Names[j+1];
					Names[j+1]=temp;
				}
			}
		}

		System.out.println("\nSorted names are :");
		for(i=0;i<n;i++)
			System.out.println(Names[i]);
	}
}