import java.util.*;

class Armstrong extends Main{
	private int n;
	public void setn(){
		Scannerer sc=new Scanner(System.in);
		n=sc.nextInt();
	}
	public void print(){
		int i,sum=0;
		int c=0,p=n;
		
		while(p!=0){
			c++;
			p=p/10;
		}
		p=n;
		while(n!=0){
			sum=sum+(Math.pow(n%10,c);
			n=n/10;
		}
		if(sum==p)
		{
			System.out.printf("%d is Armstrong number\n",p);
		}
		else{
			System.out.printf("%d is not a Armstrong number\n",p);
		}
	}
}