import java.util.Scanner;

class StringReverse
{
	public static void main(String[] args)
	{
	Scanner in=new Scanner(System.in);
	String s,rs="";
	int i;
	System.out.println("Enter a string");
	s=in.nextLine();
	for(i=s.length()-1;i>=0;i--)
	{
		rs=rs+s.charAt(i);
	}
	System.out.println("reversed string is : "+rs);
	}
}