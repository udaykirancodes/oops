import java.util.Scanner;

abstract class Employee
{
	abstract double getAmount();
}

class HourlyEmployee extends Employee
{
	double h,sh;
	HourlyEmployee(double h,double sh)
	{
		this.h=h;
		this.sh=sh;
	}
	double getAmount(){return h*sh;}//method signature must be same
}

class WeeklyEmployee extends Employee
{
	double w,sw;
	WeeklyEmployee(double w, double sw)
	{
		this.w=w;
		this.sw=sw;
	}
	double getAmount(){return w*sw;}
}

class EmployeeAmount
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 1 for HourlyEmployee and 2 for WeeklyEmployee");
		int op=in.nextInt();
		if (op==1)
		{
			System.out.println("Enter total hours worked and salary per hour");
			var h=new HourlyEmployee(in.nextDouble(),in.nextDouble());
			System.out.println("amount to be paid "+h.getAmount());
		}
		if (op==2)
		{
			System.out.println("Enter total weeks worked and salary per week");
			var w=new WeeklyEmployee(in.nextDouble(),in.nextDouble());
			System.out.println("amount to be paid "+w.getAmount());
		}
	}
}