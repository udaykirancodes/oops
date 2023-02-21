import java.util.Scanner;
class Occurances
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		String s;
		char c;
		int count,i;
		System.out.println("Enter a string");
		s=in.next();
		System.out.println("Enter any character"); 
		c=in.next().charAt(0);
		for(count=0,i=0;i<s.length();i++)            //see Occurances1.java for better version
		{
			if(s.indexOf(c,i)!=-1)
			{
				count++;
				i=s.indexOf(c,i);
			}
		}
		System.out.println("Number of "+c+"'s in "+s+" are "+count);
	}
}