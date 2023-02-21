import java.util.Scanner;
//done according to the question, can bedone better see EmployeeMain1.java

class Employee
{
	String firstname,lastname;
	Employee(String f,String l)
	{
		firstname=f;
		lastname=l;
	}
	String getFirstName(){return firstname;}
	String getLastName(){return lastname;}
}

class ContractEmployee extends Employee
{
	ContractEmployee(String f,String l,double salary)
	{
		super(f,l);
		this.salary=salary;
	}
	private String department,designation;
	private double salary;
	void setDepartment(String d)
	{
		department=d;
	}
	void setDesignation(String d)
	{
		designation=d;
	}
	void displayFullName()
	{
		System.out.println(firstname+" "+lastname);
	}
	String getDepartment(){return department;}
	String getDesignation(){return designation;}
	void displaySalary()
	{
		System.out.println("salary : "+salary);
	}
}

class RegularEmployee extends Employee
{
	RegularEmployee(String f, String l, double salary)
	{
		super(f,l);
		this.salary=salary;
	}
	private String department,designation;
	private double salary;
	void setDepartment(String d)
	{
		department=d;
	}
	void setDesignation(String d)
	{
		designation=d;
	}
	void displayFullName()
	{
		System.out.println(firstname+" "+lastname);
	}
	String getDepartment(){return department;}
	String getDesignation(){return designation;}
	void displaySalary()
	{
		System.out.println("salary : "+salary);
	}
}

class EmployeeMain
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int op;
		System.out.println("select whether");
		System.out.println("1.ContractEmployee 2.RegularEmployee");
		op=in.nextInt();
		System.out.println("Enter firstname,lastname,salary");

		if (op==1)
		{
			var ce=new ContractEmployee(in.next(),in.next(),in.nextDouble());
			System.out.println("Enter department,designation");
		 	ce.setDepartment(in.next());
		 	ce.setDesignation(in.next());
		 	System.out.println("Details of employee are : ");
		 	ce.displayFullName();
		 	ce.displaySalary();
		 	System.out.println("department : "+ce.getDepartment());
			System.out.println("designation : "+ce.getDesignation());
		}
		else if(op==2)
		{
			var re=new RegularEmployee(in.next(),in.next(),in.nextDouble());
			System.out.println("Enter department,designation");
		 	re.setDepartment(in.next());
		 	re.setDesignation(in.next());
		 	System.out.println("Details of employee are : ");
		 	re.displayFullName();
		 	re.displaySalary();
		 	System.out.println("department : "+re.getDepartment());
			System.out.println("designation : "+re.getDesignation());
		}
	}
}