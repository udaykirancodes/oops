import java.util.*;

class e_book_stall{
    //Encapsulation
    String book_name,book_author;
    int book_count;
    public void set()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the book name: ");
        book_name=sc.nextLine();
        System.out.print("Enter the book author: ");
        book_author=sc.nextLine();
        System.out.print("Enter the books count: ");
        book_count=sc.nextInt();
    }
    // public String getname(){
    //     return book_name;
    // }
    // public String getauthor(){
    //     return book_author;
    // }
    // public int getcount(){
    //     return book_count;
    // }
    public void update(int p)
    {
        book_count=book_count-p;
    }
}
class customer{
    String customer_id,customer_name,customer_address;
    String items[]=new String[100];
    int i=0;
    public void set()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter customer id: ");
        customer_id=sc.next();
        System.out.print("Enter customer_name");
        customer_name=sc.next();
        System.out.print("Enter customer address: ");
        customer_address=sc.next();
    }
    // public String getid()
    // {
    //     return customer_id;
    // }
    // public String getname(){
    //     return customer_name;
    // }
    // public String getaddress(){
    //     return customer_address;
    // }
    public void add(String name)
    {
        items[i]=name;
        i++;
    }
}
class e_book_stall_main{
    public static void main(String []args)
    {
        int n;
        System.out.print("Enter the number of books type: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        e_book_stall book[]=new e_book_stall[n];
        int i;
        for(i=0;i<n;i++)
        {
            book[i]=new e_book_stall();
            book[i].set();
        }
        int k=0;
        customer cust[]=new customer[100];
        int flag=0;
        do{
            System.out.println("1.New Customer\n2.Exit\n");
            int option,count=0;
            option=sc.nextInt();
            String book_name;
            switch(option)
            {
                case 1:
                    System.out.print("Enter the book name to purchase: ");
                    book_name=sc.next();
                    System.out.print("Enter the number of books wants to purchase: ");
                    count=sc.nextInt();
                    for(i=0;i<n;i++)
                    {
                        if(book_name.equals(book[i].book_name) && book[i].book_count>=count)
                        {
                            break;
                        }
                    }
                    if(i==n)
                    {
                        System.out.println("There is no such book or Stack");
                    }
                    else{
                        cust[k]=new customer();
                        cust[k].set();
                        cust[k].add(book_name);
                        book[i].update(count);
                        System.out.println("Book_name: "+book[i].book_name+"Book_count: "+book[i].book_count);
                        k++;
                    }
                    break;
                case 2:
                    flag=1;
                    break;
            }
        }while(flag!=1);
    }
}