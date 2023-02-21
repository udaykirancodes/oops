import java.util.Scanner;

interface Payable
{
	int getAmount(int n);  //public abstract by default//also cann't have constructors since variables will be public Sstatic fina
}

class Employee implements Payable
{
	int salary;
	Employee(int s)
	{
		salary=s;
	}

	public int getAmount(int months) //since default modifier more restrictive than public
	{
		return salary*months;
	}
}

class Invoice
{
	public int getAmount(int n) //since default modifier more restrictive than public
	{
		int bill=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of items,amount for each type of item ");
		for(int i=0;i<n;i++)
			bill=bill+in.nextInt()*in.nextInt();
		return bill;
	}
}

class EmployeeAmountInterface
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 1 for Employee and 2 for Invoice");
		int op=in.nextInt();
		if (op==1)
		{
			System.out.println("Enter salary/month and total months");
			int s=in.nextInt(),n=in.nextInt();
			Employee e=new Employee(s);
			System.out.println("Amount to be paid = "+e.getAmount(n));
		}
		else if(op==2)
		{
			Invoice i=new Invoice();
			System.out.println("Enter number of types of items");
			System.out.println("Total bill is = "+i.getAmount(in.nextInt()));
		}
	}
}