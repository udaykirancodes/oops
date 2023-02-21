import java.util.Scanner;

class MatrixMulti
{
	public static void main(String arg[])
	{
		int a[][],b[][],c[][],m1,n1,m2,n2,i,j,k;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the order of matrix 1");
		m1=in.nextInt();
		n1=in.nextInt();
		System.out.println("Enter the order of matrix 2");
		m2=in.nextInt();
		n2=in.nextInt();

		if(n1==m2)
		{
		a=new int[m1][n1];
		b=new int[m2][n2];
		c=new int[m1][n2];

		System.out.println("Enter the elements of matrix 1");
		for(i=0;i<m1;i++)
			for(j=0;j<n1;j++)
				a[i][j]=in.nextInt();

		System.out.println("Enter the elements of matrix 2");
		for(i=0;i<m2;i++)
			for(j=0;j<n2;j++)
				b[i][j]=in.nextInt();

		for(i=0;i<m1;i++)
			for(j=0;j<n2;j++) 
				{
				c[i][j]=0;
				for(k=0;k<n1;k++)
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}

		System.out.println("Answer");
		for(i=0;i<m1;i++)
			{
			for(j=0;j<n2;j++)
				System.out.print(c[i][j]+" ");
			System.out.println();
			}
		}
		else
			System.out.println("Matrix multiplication is not possible");

		
	}
}