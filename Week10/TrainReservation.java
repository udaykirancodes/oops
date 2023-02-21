import java.util.Scanner;

class Berths
{
	static int avlBerths=10;
	static{System.out.println("Available berths are "+avlBerths);}//executed when the class is loaded
	
	static synchronized void berthAllotment(int reqBerths)
	{
		System.out.println(Thread.currentThread().getName());
		if(reqBerths<=avlBerths)
		{
			avlBerths=avlBerths-reqBerths;
			System.out.println("tickect confirmed.");
			System.out.println("tickect printed.");
			System.out.println("Available berths are : "+avlBerths);
		}
		else 
			System.out.println("Soory, No berths are available");
	}
}

class Person extends Thread
{
	int reqBerths;
	Person(int reqBerths,String personName)//here we receive a person name and set it as a thread name// super(personName);
	{
		super(personName);
		this.reqBerths=reqBerths;
	}
	public void run()//note that we cann't change the signature of run(), if we do so, it doesnot mean overriding.
	{
		Berths.berthAllotment(reqBerths);
	}
}

class TrainReservation
{
	public static void main(String[] args)
	{
		Person p1=new Person(4,"venu");//(in reqBerths,int personName)
		Person p2=new Person(5,"vikas");
		Person p3=new Person(5,"shiva");

		p1.start();
		p2.start();
		p3.start();
	}
}