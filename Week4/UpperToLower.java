import java.util.Scanner;

class UpperToLower
{
	public static void main(String[] args)
	{
	Scanner in=new Scanner(System.in);
	String s;
	System.out.println("Enter a string");
	s=in.nextLine();
	System.out.println("in uppercase "+s.toUpperCase());
	System.out.println("in lowercase "+s.toLowerCase());
	}
}