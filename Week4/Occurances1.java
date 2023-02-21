import java.util.Scanner;
class Occurances1
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

		count=0;
		i=0;
		while(i<s.length())
		{
			if(s.indexOf(c,i)==-1)
				break;
			else
			{
				count++;
				i=s.indexOf(c,i)+1;
			}
		}
		System.out.println("Number of "+c+"'s in "+s+" are "+count);
	}
}