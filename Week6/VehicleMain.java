import java.util.Scanner;

class Vehicle
{
	int number,insnumber;
	String color;
	Vehicle(int number, int insnumber,String color)
	{
		this.number=number;
		this.insnumber=insnumber;
		this.color=color;
	}

	double getConsumption(){return 0.05;}
	void displayConsumption()
	{
		System.out.println("Consumption = "+0.05+" litres per km");
	}
}

class TwoWheeler extends Vehicle
{
	TwoWheeler(int number, int insnumber,String color)
	{
		super(number,insnumber,color);
	}
	void maitenance()
	{
		System.out.println("maitenance is = "+1000+" rupees");
	}
	void average(int avgdis)
	{
		System.out.println("average ="+(0.05*avgdis*75+1000)+" rupees");
	}
}

class FourWheeler extends Vehicle
{
	FourWheeler(int number, int insnumber,String color)
	{
		super(number,insnumber,color);
	}
	void maitenance()
	{
		System.out.println("maitenance is = "+2000+" rupees");
	}
	void average(int avgdis)
	{
		System.out.println("average ="+(0.05*avgdis*75+2000)+" rupees");
	}
}

class VehicleMain
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number,insurancenumber, color of TwoWheeler");
		TwoWheeler tw=new TwoWheeler(in.nextInt(),in.nextInt(),in.next());
		tw.maitenance();
		System.out.println("Enter average distance travelled per month");
		tw.average(in.nextInt());
		System.out.println("Enter the number,insurancenumber, color of FourWheeler");
		FourWheeler fw=new FourWheeler(in.nextInt(),in.nextInt(),in.next());
		fw.maitenance();
		System.out.println("Enter average distance travelled per month");
		fw.average(in.nextInt());
	}
}