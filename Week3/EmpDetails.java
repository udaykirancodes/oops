import java.util.Scanner;

class Employee{
	String id,name,desig,gender,salary,address,age;
	void display()
	{
		System.out.print("Id : "+id+"\nName : "+name);
		System.out.print("\nDesignation : "+desig+"\nGender : "+gender);
		System.out.print("\nSalary : "+salary+"\nAddress : "+address);
		System.out.println("\nAge : "+age);
	}
}

class EmpDetails
{
	public static void main(String args[])
	{
		int n,i;
		Scanner in=new Scanner(System.in);
		System.out.println("How many number of employee's details you want to enter");
		n=in.nextInt();
		in.nextLine();//for consuming \n character
		Employee emp[]=new Employee[n];
		
		for(i=0;i<n;++i)
			emp[i]=new Employee();
		
		for(i=0;i<n;++i)
		{
			System.out.println(i+1+".Enter Id,Name,Designation,Gender,Salary,Address and Age");
			emp[i].id=in.nextLine();
			emp[i].name=in.nextLine();
			emp[i].desig=in.nextLine();
			emp[i].gender=in.nextLine();
			emp[i].salary=in.nextLine();
			emp[i].address=in.nextLine();
			emp[i].age=in.nextLine();
		}

		System.out.println("Enter an ID to search");
		String idkey=new String(in.nextLine());
		for(i=0;i<n;++i)
		{
			if(idkey.equals(emp[i].id))
			{
				System.out.println("\nId found");
				emp[i].display();
				break;
			}
		}
		if(i==n) System.out.println("Id not found");
	}
}