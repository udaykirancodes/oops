import java.util.Scanner;
import java.lang.String;

class EqualsEqualsIgnore
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String s1=new String(),s2=new String();
		System.out.println("Enter two strings");
		s1=in.next();
		s2=in.next();
		System.out.println("using Equals "+s1.equals(s2));
		System.out.println("using EqualsIgnoreCase "+s1.equalsIgnoreCase(s2));
	}
}