/*import java.util.Scanner;
class StringLength
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		String s;int length;
		System.out.println("Enter a string");
		s=in.nextLine();
		length=s.length();
		System.out.println("length of "+s+" is "+length);
	}
}*/

import java.util.Scanner;
class StringLength
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		String s;int length=0;
		System.out.println("Enter a string");
		s=in.next();
		char sa[]=s.toCharArray();
		for(char c:sa) length++;
		System.out.println("length of "+s+" is "+length);
	}
}

/*import java.util.Scanner;
class StringLength
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		String s;int length;
		System.out.println("Enter a string");
		s=in.next();
		try{
			for(count=0;;count++) s.charAt(count);
		}
		catch(Exception StringIndexOutOfBoundsException){}

		
		System.out.println("length of "+s+" is "+length);
	}
}*/
