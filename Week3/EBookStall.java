import java.util.Scanner;

class Book
{
	String name,author;
	int count;
}

class Customer
{
	String id,name,address;
}

class EBookStall
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of books available");
		int nb=in.nextInt();
		Book book[]=new Book[nb];

		int i;
		for(i=0;i<nb;++i)
			book[i]=new Book();

		for(i=0;i<nb;++i)
		{
			System.out.println("Enter name,author and count of book "+(i+1));
			book[i].name=in.next();
			book[i].author=in.next();
			book[i].count=in.nextInt();
		}

		System.out.println("Enter the number of customers");
		int nc=in.nextInt();
		Customer customer[]=new Customer[nc];
		for(i=0;i<nc;++i)
			customer[i]=new Customer();
		
		String textbook;
		int j;
		for(i=0;i<nc;++i)
		{
			System.out.println("Enter id,name and address of customer "+(i+1));
			customer[i].id=in.next();
			customer[i].name=in.next();
			customer[i].address=in.next();
			System.out.println("Enter the book name he bought");
			textbook=in.next();
			for(j=0;j<nb;j++)
			{
				if(textbook.equals(book[j].name))
				{ 
					--book[j].count;
					break;
				}
			}
			System.out.println("remaning "+book[j].name+"'s are "+book[j].count);
		}
	}
}