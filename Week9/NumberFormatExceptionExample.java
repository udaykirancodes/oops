import java.lang.Integer;//not needed because it is implicitly imported.
import java.util.Scanner;

class NumberFormatExceptionExample
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int n;
		String sn;
		do
		{
			sn=in.next();
			try
			{
				n=Integer.parseInt(sn);
				break;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Enter a valid number");
			}
		}while(true);
		System.out.println("Entered "+n);
	}
}

//There is an exception InputMismatchException also