import java.util.Scanner;

interface Vehicle
{
	String getName(); //public abstract by default
	String getColour();
	String getNumber();
	double getConsumption();
}

class TwoWheeler implements Vehicle
{
	String name,colour,number;
	double mileage;
	TwoWheeler(String na,String co,String nu,double mi)
	{
		name=na;
		colour=co;
		number=nu;
		mileage=mi;
	}
	
	public String getName(){return name;} //default access modifier causes error
	public String getColour(){return colour;}
	public String getNumber(){return number;}
	public double getConsumption()
	{
		return 1/mileage;
	}
}

class FourWheeler implements Vehicle
{
	String name,colour,number;
	double mileage;
	FourWheeler(String na,String co,String nu,double mi)
	{
		name=na;
		colour=co;
		number=nu;
		mileage=mi;
	}
	public String getName(){return name;}
	public String getColour(){return colour;}
	public String getNumber(){return number;}
	public double getConsumption()
	{
		return 1/mileage;
	}
}

class VehicleMain
{
	public static void main(String[] args)
	{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter name,color,number and mileage for twowheeler");
	TwoWheeler t=new TwoWheeler(in.next(),in.next(),in.next(),in.nextDouble());
	System.out.println("Enter name,color,number and mileage for fourwheeler");
	FourWheeler f=new FourWheeler(in.next(),in.next(),in.next(),in.nextDouble());
	System.out.println("Details of twowheeler");
	System.out.println(t.getName()+"  "+t.getNumber()+"   "+t.getColour()+"    "+t.getConsumption()+"ltr/km");
	System.out.println("Details of fourwheeler");
	System.out.println(f.getName()+"  "+f.getNumber()+"   "+f.getColour()+"    "+f.getConsumption()+"ltr/km");
	}
}