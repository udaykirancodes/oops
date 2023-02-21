import java.util.Scanner;

class Compare
{
	public static void main(String args[])
	{
		String s1,s2;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two strings");
		s1=in.nextLine();
		s2=in.nextLine();
		System.out.println(s1.compareTo(s2));
	}
}