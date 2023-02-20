import java.util.*;
import java.lang.*;

class larger_smaller{
	public static void main(String [] args)
	{
		int n,i;
		System.out.print("enter array size: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		//smaller and bigger
		int min=999,max=-999;
		for(i=0;i<n;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			if(a[i]>max){
				max=a[i];
			}
		}
		System.out.println("Min value "+min+"  max value is  "+max);
	}
}