import java.util.Scanner;


class Calci
{
	public static void main(String arg[])
	{
		int op,a,b;
		double c;
		System.out.println("Select the operation: ");
		System.out.println("1.add  2.subtract  3.multiply  4.divide  ");
		Scanner in=new Scanner(System.in);
		op=in.nextInt();
		System.out.println("Enter a,b");
		a=in.nextInt();
		b=in.nextInt();

		switch(op)
		{
			case 1: System.out.println("Answer is: "+(a+b));
					break;
			case 2: System.out.println("Answer is: "+(a-b));
					break;
			case 3: System.out.println("Answer is: "+(a*b));
					break;
			case 4: System.out.println("Answer is: "+(a/b));
			break;
			default : System.out.println("Please enter two valid numbers");
		}



	}
}