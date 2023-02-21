import java.io.*;
import java.util.*;

class Theatre extends Thread
{
	public void run()
	{
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number of persons");
		int n= in.nextInt();// no. of persons
		
		for(int i=0;i<n;i++)
		{
			System.out.println(i+1 + " ticket issued");
			try{Thread.sleep(1000);}catch(Exception e){}
		}

		try{Thread.sleep(5000);}catch(Exception e){}

		System.out.println("\n");
		for(int i=0;i<n;i++)
		{
			System.out.println(i+1 + " ticket showed");
			try{Thread.sleep(1000);}catch(Exception e){}
			System.out.println(i+1 +"th ticket holder is entered");
			try{Thread.sleep(5000);}catch(Exception e){}
		}
	}
}

class Theatre1
{
	public static void main(String arg[])
	{
		Theatre t =new Theatre();
		t.start();
	}
}
//tickets are issued at once
//then start showing and entering
//here actually no need of threds we can do in main thread itself