import java.util.Scanner;

interface StudentFee
{
	int nfee=30000,hfee=50000;//public statc final
	int getAmount();
	String getFirstName();//public abstract
	String getLastName();
	String getAddress();
	String getContact();
}

class NonHostler implements StudentFee
{
	String firstname,lastname,address,contact;
	NonHostler(String fn,String ln,String a,String c)
	{
		firstname=fn;
		lastname=ln;
		address=a;
		contact=c;
	}
	public int getAmount(){return nfee;}//must be public as we are overriding a public method// also must be same or less restrictivje
	public String getFirstName(){return firstname;}
	public String getLastName(){return lastname;}
	public String getAddress(){return address;}
	public String getContact(){return contact;}
}

class Hostler implements StudentFee
{
	String firstname,lastname,address,contact;
	Hostler(String fn,String ln,String a,String c)
	{
		firstname=fn;
		lastname=ln;
		address=a;
		contact=c;
	}
	public int getAmount(){return hfee;}
	public String getFirstName(){return firstname;}
	public String getLastName(){return lastname;}
	public String getAddress(){return address;}
	public String getContact(){return contact;}
}

class Student
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);

		System.out.println("Enter firstname,lastname,address and contact details of nonhostler");
		NonHostler n=new NonHostler(in.next(),in.next(),in.next(),in.next());
		
		System.out.println("Enter firstname,lastname,address and contact details of hostler");
		Hostler h=new Hostler(in.next(),in.next(),in.next(),in.next());
		
		System.out.println("\n\nDetails of nonhostler");
		System.out.println(n.getFirstName()+" "+n.getLastName()+"    "+n.getAddress()+"    "+n.getContact());
		System.out.println("amount to be paid "+n.getAmount());

		System.out.println("\n\nDetails of hostler");
		System.out.println(h.getFirstName()+" "+h.getLastName()+"    "+h.getAddress()+"    "+h.getContact());
		System.out.println("amount to be paid "+h.getAmount());
	}
}