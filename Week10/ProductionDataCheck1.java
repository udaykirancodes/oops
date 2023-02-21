class Producer extends Thread
{
	Producer(){}

	Producer(String n)
	{
		super(n);
	}

	public void run()
	{
		for(int i=0;i<8;i++)
		{
			try
			{
				Thread.sleep(11);
			}
			catch(InterruptedException e)
			{}
		}
	}
}

class Consumer extends Thread
{
	Consumer(){}
	Producer p;
	Consumer(Producer p,String n)
	{
		super(n);
		this.p=p;
	}

	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Is production done? "+(p.isAlive()?"No":"Yes"));
			try
			{
				Thread.sleep(10);
			}
			catch(InterruptedException e)
			{
				System.out.println("consumer thread interrupted");
			}
		}
	}
}

class ProductionDataCheck1
{
	public static void main(String args[])
	{
		Producer p=new Producer("producer");
		Consumer c=new Consumer(p,"consumer");
		p.start();
		c.start();
	}
}