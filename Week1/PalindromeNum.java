import java.util.Scanner;
class PalindromeNum
{
    public static void main(String arg[])
    {
        int num,rem,temp,rev=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        num=in.nextInt();
        temp=num;
        while(num>0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(temp==rev) System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");
    }
}