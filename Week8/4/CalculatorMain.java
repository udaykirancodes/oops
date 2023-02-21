import Calculator.*;

class CalculatorMain
{
	public static void main(String[] args)
	{
		System.out.print("addition of 1,2,3,4,5   : ");
		System.out.println(Add.add(1,2,3,4,5));

		System.out.print("subtraction of 45, 4   : ");
		System.out.println(Subtract.subtract(45,4));

		System.out.print("dision of 56.4, 2   : ");
		System.out.println(Divide.divide(56.4,2));

		System.out.print("multiplication of 1, 2, 3, 45.4, 6   : ");
		System.out.println(Multiply.multiply(1,2,3,45.4,6));
	}
}