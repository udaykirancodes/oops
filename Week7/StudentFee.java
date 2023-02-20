import java.util.*;
interface StudentFee {
    int getamount();
    String getFirstName();
    String getLastName();
    String getAddress();
    String getContact();
}
class hostler implements StudentFee{
    Scanner sc=new Scanner(System.in);
    public int getamount(){
        System.out.println("enter the amount paid for hostler student: ");
        return sc.nextInt();
    }
    public String getFirstName()
    {
        System.out.println("entre the firstname of student: ");
        return sc.next();
    }
    public String getLastName()
    {
        System.out.println("enter the lastname of student: ");
        return sc.next();
    }
    public String getAddress()
    {
        System.out.println("enter the address of student: ");
        return sc.next();
    }
    public String getContact()
    {
        System.out.println("enter the student contact ");
        return sc.next();
    } 
}
class Nonhostler implements StudentFee{
    Scanner sc=new Scanner(System.in);
    public int getamount(){
        System.out.println("enter the amount paid for NonHostler student: ");
        return sc.nextInt();
    }
    public String getFirstName()
    {
        System.out.println("entre the firstname of student: ");
        return sc.next();
    }
    public String getLastName()
    {
        System.out.println("enter the lastname of student: ");
        return sc.next();
    }
    public String getAddress()
    {
        System.out.println("enter the address of student: ");
        return sc.next();
    }
    public String getContact()
    {
        System.out.println("enter the student contact ");
        return sc.next();
    } 
}

class StudentFee_Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int option;
        hostler h=new hostler();
        Nonhostler nh=new Nonhostler();
        while(true)
        {
            String fname,lname,contact,address;
            int amount;
            System.out.println("1.Hostler\n2.NonHostler\n3.exit\n");
            System.out.println("choose option: ");
            option=sc.nextInt();
            switch(option)
            {
                case 1:
                    fname=h.getFirstName();
                    lname=h.getLastName();
                    address=h.getAddress();
                    contact=h.getContact();
                    amount=h.getamount();
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Name: "+fname+" "+lname);
                    System.out.println("Amount: "+amount);
                    System.out.println("Contact: "+contact);
                    System.out.println("Address: "+address);
                    System.out.println("---------------------------------------------------------");
                    break;
                case 2:
                    fname=nh.getFirstName();
                    lname=nh.getLastName();
                    address=nh.getAddress();
                    contact=nh.getContact();
                    amount=nh.getamount();
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Name: "+fname+" "+lname);
                    System.out.println("Amount: "+amount);
                    System.out.println("Contact: "+contact);
                    System.out.println("Address: "+address);
                    System.out.println("---------------------------------------------------------");
                    break;
                case 3:
                    System.exit(option);
            }
        }
    }
}