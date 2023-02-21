import java.util.Scanner;

class SubString
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=in.nextLine();
		System.out.println("Enter start,end indices for substring");
		int i=in.nextInt(),j=in.nextInt();
		String ss=s.substring(i,j);
		System.out.println("substring is "+ss);
	}
}