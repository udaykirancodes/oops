import java.util.Scanner;
class StringConcat
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		String s1,s2,s3;
		System.out.println("Enter two strings");
		s1=in.next();
		s2=in.next();
		s3=s1.concat(s2);
		System.out.println("concated string is "+s3);
	}
}