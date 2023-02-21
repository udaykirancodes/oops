import java.util.Scanner;

class CompareTo
{
	public static void main(String args[])
	{
		String s1,s2;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two strings");
		s1=in.nextLine();
		s2=in.nextLine();
		if (s1.compareTo(s2)==0) System.out.println("Two strings are equal");
		else if(s1.compareTo(s2)<0) System.out.println(s2+" comes after "+s1);
		else if(s1.compareTo(s2)>0) System.out.println(s2+" comes before "+s1);
	}
}