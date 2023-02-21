import java.lang.Thread;//no need

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("My Thread "+this.getName()+" is running");
	}
}

class MyThreadMain
{
	public static void main(String[] args)
	{
		MyThread t = new MyThread();
		t.start();

		//t.start(); error
	}
}