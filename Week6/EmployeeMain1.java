import java.util.Scanner;
//done according to the question, can bedone better see EmployeeMain1.java

class Employee
{
	private String firstname,lastname;
	private String department,designation;
	private double salary;
	Employee(String f,String l,double s)
	{
		firstname=f;
		lastname=l;
		salary=s;
	}
	String getFirstName(){return firstname;}
	String getLastName(){return lastname;}
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

class ContractEmployee extends Employee
{
	ContractEmployee(String f,String l,double s)
	{
		super(f,l,s);
	}
}

class RegularEmployee extends Employee
{
	RegularEmployee(String f, String l, double s)
	{
		super(f,l,s);
	}
}

class EmployeeMain1
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int op;
		System.out.println("select whether");
		System.out.println("1.ContractEmployee 2.RegularEmployee");
		op=in.nextInt();
		System.out.println("Enter firstname,lastname,salary");
		Employee e;
		if (op==1)
		{
			e=new ContractEmployee(in.next(),in.next(),in.nextDouble());
		}
		else//else if(op==2)  gives error since might not have been initialized
		{
			e=new RegularEmployee(in.next(),in.next(),in.nextDouble());
		}//perfect use of runtime polymorphism

        System.out.println("Enter department,designation");
		e.setDepartment(in.next());
		e.setDesignation(in.next());
		System.out.println("Details of employee are : ");
		e.displayFullName();
		e.displaySalary();
		System.out.println("department : "+e.getDepartment());
		System.out.println("designation : "+e.getDesignation());
	}
}