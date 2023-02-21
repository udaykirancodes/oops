import java.util.Scanner;

class MatrixAdd
{
	public static void main(String arg[])
	{
		int a[][],b[][],c[][],m,n,i,j;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the order of matrix");
		m=in.nextInt();
		n=in.nextInt();
		a=new int[m][n];
		b=new int[m][n];
		c=new int[m][n];
		System.out.println("Enter the elements of matrix 1");
		
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				a[i][j]=in.nextInt();

		System.out.println("Enter the elements of matrix 2");
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				b[i][j]=in.nextInt();

		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				c[i][j]=a[i][j]+b[i][j];

		System.out.println("Answer");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
				System.out.print(c[i][j]+" ");
			System.out.println();
		}
	}
}