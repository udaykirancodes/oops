import java.util.Scanner;

class Geared extends TwoWheeler
{
	String name,type;
	Geared(int num,int insnum,String cons,String name,String type)
	{
		super(num,insnum,cons);
		this.name=name;
		this.type=type;
	}
	String getType(){return type;}
	String getName(){return name;}
	void average(int avgdis)
	{
		super.average(avgdis);//no need// already available from superclass
	}
}

class NonGeared extends TwoWheeler
{
	String name,type;
	NonGeared(int num,int insnum,String cons,String name,String type)
	{
		super(num,insnum,cons);
		this.name=name;
		this.type=type;
	}
	String getType(){return type;}
	String getName(){return name;}
	void average(int avgdis)
	{
		super.average(avgdis);
	}
}

class GearedNonGeared
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number,insurancenumber, color of Geared TwoWheeler, name and typeof company");
		Geared gw=new Geared(in.nextInt(),in.nextInt(),in.next(),in.next(),in.next());
		System.out.println("Enter average distance travelled per month");
		gw.average(in.nextInt());
		System.out.println("Enter the number,insurancenumber, color of Non-Geared TwoWheeler name and typeof company");
		NonGeared ngw=new NonGeared(in.nextInt(),in.nextInt(),in.next(),in.next(),in.next());
		System.out.println("Enter average distance travelled per month");
		ngw.average(in.nextInt());
	}
}
