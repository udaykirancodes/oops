import java.util.Scanner;

interface Fare
{
	double tfare=0.5; //rupees/km        public static final as they are fixed
	double bfare=1;
	double getAmount(int d);
}

class Bus implements Fare
{
	public double getAmount(int d)//must be public
	{
		return bfare*d;
	}
}

class Train implements Fare
{
	public double getAmount(int d)
	{
		return tfare*d;
	}
}

class TravellingFare
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		Bus b=new Bus();
		Train t=new Train();
		System.out.println("Enter the distance travelled by bus and train in km");
		System.out.println("Fare for bus is "+b.getAmount(in.nextInt())+" rupees");
		System.out.println("Fare for train is "+t.getAmount(in.nextInt())+" rupees");
	}
}