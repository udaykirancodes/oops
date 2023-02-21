import java.util.Scanner;

class HourlyEmployee extends ContractEmployee
{
	int noh,wph,salary;//numberofhours,wageperhour
	HourlyEmployee(String f,String l,int noh,int wph) // s=0
	{
		super(f,l,0);  // salary in contractemployee=0
		this.noh=noh;
		this.wph=wph;
	}
	int calculateWages()
	{
		salary=noh*wph*30;
		return salary;
	}
}

class WeeklyEmployee extends ContractEmployee
{
	int now,wpw,salary;
	WeeklyEmployee(String f,String l,int now,int wpw)// s=0
	{
		super(f,l,0); // salary in contractemployee=0
		this.now=now;
		this.wpw=wpw;
	}
	int calculateWages()
	{
		salary=now*wpw;
		return salary;
	}
}

class HourlyAndWeeklyEmployee
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int op;
		System.out.println("select whether");
		System.out.println("1.HourlyEmployee 2.WeeklyEmployee");
		op=in.nextInt();
		if(op==1)
		{
			System.out.println("Enter firstname,lastname,number of hours worked per day , wage per hour");
			var he=new HourlyEmployee(in.next(),in.next(),in.nextInt(),in.nextInt());
			System.out.println("Enter department,designation");
		 	he.setDepartment(in.next());
		 	he.setDesignation(in.next());
		 	System.out.println("monthly salary is : "+he.calculateWages());
		}
		if(op==2)
		{
			System.out.println("Enter firstname,lastname,number of weeks worked per month, wage per week");
			var we=new WeeklyEmployee(in.next(),in.next(),in.nextInt(),in.nextInt());
			System.out.println("Enter department,designation");
		 	we.setDepartment(in.next());
		 	we.setDesignation(in.next());
		 	System.out.println("monthly salary is : "+we.calculateWages());
		}
	}
}