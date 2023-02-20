import java.util.*;
import java.lang.*;

class palindrome extends Main{
	private int n;
	public void setn()
	{
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	}
	public void print(){
		int sum=0;
		int p=n;
		while(n!=0)
		{
			sum=(sum*10)+(n%10);
			n=n/10;
		}
		if(sum==p)
		{
			System.out.printf("%d is Palindrome\n",sum);
		}
		else{
			System.out.printf("%d is not a Palindrome\n",sum);
		}
	}
}