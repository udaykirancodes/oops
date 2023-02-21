import java.util.Scanner;

class VowelsConsonants
{
	public static void main(String[] args)
	{
	Scanner in=new Scanner(System.in);
	String s;
	char c;
	int i,count;
	System.out.println("Enter a string");
	s=in.nextLine();

	System.out.println("vowels are ");
	for(i=0,count=0;i<s.length();++i)
	{
		c=s.charAt(i);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				System.out.print(c+" ");
				count++;
			}
	}
	System.out.println();
	System.out.println("total vowels are "+count);
	System.out.println("total consonants are "+(s.length()-count));

	}
}