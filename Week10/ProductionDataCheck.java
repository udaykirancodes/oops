class ConsumerThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
			{
				try
				{
					Thread.sleep(200);  //Generally Thread.sleep() is used to pause the execution current thread//also sleep is static method
					                   //Here we can use sleep(); also since we are extending the Thread class
				}
				catch(InterruptedException e)
				{
					System.out.println("Exception caught");
				}
				System.out.println("not over ");
			}
		System.out.println("over ");
	}
}
class ProductionDataCheck
{
	public static void main(String args[])
	{
		ConsumerThread obj =new ConsumerThread();
		obj.start();
	}
}