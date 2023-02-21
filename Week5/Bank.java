import java.util.Scanner;

class Account
{
	double balance;
	String name,number,address;
	Account(double balance, String name, String number, String address)
	{
		this.balance=balance;
		this.name=name;
		this.number=number;
		this.address=address;
	}

	void debit(double amt)
	{
		if(amt<=balance)
		{
			balance=balance-amt;
			getBalance();
		}
		else System.out.println("debit amount exceeded available balance "+balance);
	}

	void credit(double amt)
	{
		balance=balance+amt;
		getBalance();
	}

	void getBalance() {System.out.println("Available balance is "+balance);}
}


class Bank
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n,i;
		System.out.println("how many accounts you want to create");
		n=in.nextInt();
		Account a[]=new Account[n];
		Double balance;
		String name,number,address;
		for(i=0;i<n;i++)
		{
			System.out.println("Enter name, accountnumber, address for account "+(i+1));
			name=in.next();
			number=in.next();
			address=in.next();
			do
			{
				System.out.print("Enter balance(>0.0) : ");
				balance=in.nextDouble();
			}while(balance<=0);
			
			a[i]=new Account(balance,name,number,address);
		}

		System.out.print("Enter an account number to process : ");
		String tempacno=in.next();
		
		
		System.out.println("Select an option :\n 1.debit\n 2.credit\n 3.check balance");
		int op=in.nextInt();
		switch(op)
		{
			case 1: System.out.print("Enter amount to be debited : ");
					a[i].debit(in.nextInt());
					break;
			case 2: System.out.print("Enter amount to be credited : ");
					a[i].credit(in.nextInt());
					break;
			case 3: a[i].getBalance();
		}
	}
}