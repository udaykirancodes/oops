 import java.lang.Math;
//import java.util.concurrent.TimeUnit;
import java.util.Random;

class Dices
{
	public static void main(String[] args)
	{
		int num1,num2,i,sa=0;
		for(i=0;i<10;i++)
		{
			Random r=new Random();
			num1=r.nextInt(6)+1;        //to produce from n1 to n2     produce from 0 to n2-n1 and add n1
			num2=r.nextInt(6)+1;
			System.out.println("num1 "+num1+"   num2 "+num2);
			if(num1==num2)
				sa++;

			try {
 				   Thread.sleep(10000);
				}
			catch (InterruptedException ie)
				{
    				System.out.println("interrupted");
				}
			
		}
		System.out.println("successful attempts = "+sa);
	}
}