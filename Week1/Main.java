import java.util.*;
import java.lang.*;

class Main{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		prime_factors prime=new prime_factors();
		Armstrong arm=new Armstrong();
		palindrome pal=new palindrome();
		while(true)
		{
			System.out.println("1.Prime Factors");
			System.out.println("2.Palindrome");
			System.out.println("3.Armstrong Number");
			System.out.println("4Break");
			System.out.println("Enter any option");
			int choose=sc.nextInt();
			int flag=0;
			switch(choose)
			{
				case 1:
					prime.setn();
					prime.print();
					break;
				case 2:
					pal.setn();
					pal.print();
					break;
				case 3:
					arm.setn();
					arm.print();
					break;
				case 4:
					flag=1;
					break;
				default:
					System.out.println("Incorrect input");
					break;
			}
			if(flag==1)
			{
				break;
			}
		}
	}
}