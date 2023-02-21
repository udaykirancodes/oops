import java.util.Scanner;

class TrafficSignal extends Thread
{
	int n;
	TrafficSignal(int n)
	{
		this.n=n;
	}
	public void run()
	{
		for (int i=0;i<n;i++)
		{
			try
			{
				System.out.println("red light is glowing");
				Thread.sleep(10000);
				System.out.println("red light is off\n");

		    	System.out.println("yellow light is glowing");
				Thread.sleep(10000);
				System.out.println("yellow light is off\n");

				System.out.println("green light is glowing");
				Thread.sleep(10000);
				System.out.println("green light is off\n");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

class Traffic
{
	public static void main(String args[])
	{
		System.out.print("How many cycles : ");
		int n=new Scanner(System.in).nextInt();//as we are using just one time :)
		TrafficSignal t=new TrafficSignal(n);

		t.start();
	}
}