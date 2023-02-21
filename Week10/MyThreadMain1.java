class MyThread implements Runnable
{
	public void run()
	{
		System.out.println("Thread is running");
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			System.out.println("InterruptedException caught");
		}
	}
}

class MyThreadMain1
{
	public static void main(String[] args)
	{
		Thread t=new Thread(new MyThread(),"MyThread");
		t.start();		
	}
}