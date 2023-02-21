import java.util.Scanner;
class emp
{
	int emp_id;
	String name,age,gender,desig,salary,address;
	void display()
	{
		System.out.print("Id : "+emp_id+"\nName : "+name);
		System.out.print("\nDesignation : "+desig+"\nGender : "+gender);
		System.out.print("\nSalary : "+salary+"\nAddress : "+address);
		System.out.println("\nAge : "+age);
	}
}
class emp_details
{
	public static void main()
	{
		System.out.println("enter no.of employees you want");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		emp k[]=new emp[n];
		for(int i=0;i<n;i++)
		{
			k[i]=new emp();
		}
		scan.nextLine();
		int i;
		for(i=0;i<n;i++)
		{
			System.out.println(i+1+".Enter Id,Name,Designation,Gender,Salary,Address and Age");
			k[i].emp_id=scan.nextInt();
			k[i].name=scan.nextLine();
			k[i].desig=scan.nextLine();
			k[i].gender=scan.nextLine();
			k[i].salary=scan.nextLine();
			k[i].address=scan.nextLine();
			k[i].age=scan.nextLine();
		}
		System.out.println("enter the id to search");
		int id_search=scan.nextInt();
		for(i=0;i<n;i++)
		{
			if(id_search==k[i].emp_id)
			{
				System.out.println("id found");
				k[i].display();
				break;
			}
		}
	}
}