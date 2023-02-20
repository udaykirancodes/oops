import java.lang.StackWalker.Option;
import java.util.Scanner;
import java.lang.*;

class employee {
    String FirstName,LastName;
    public String getFirstName() {
        return FirstName;
    }
    public String getLastName() {
        return LastName;
    }
}
class contract_emloyee extends employee{
    String department,designation;
    int salary;
    public String FullName(){
        return super.FirstName+super.LastName;
    }
    public String getDepartment() {
        return department;
    }
    public String getDesignation() {
        return designation;
    }
}
class regular_employee extends employee{
    String department,designation;
    int salary;
    public String FullName(){
        return super.FirstName+super.LastName;
    }
    public String getDepartment() {
        return department;
    }
    public String getDesignation() {
        return designation;
    }
}
class employee_main{
    public static void main(String[] args) {
        int option;
        Scanner sc=new Scanner(System.in);
        while(true )
        {
            System.out.println("1.Contract_Employee\n2.Regular_Employee\n3.EXIT");
            System.out.println("choose any option: ");
            option=sc.nextInt();
            switch(option)
            {
                case 1:
                    contract_emloyee ce=new contract_emloyee();
                    System.out.print("enter the employee first name: ");
                    ce.FirstName=sc.next();
                    System.out.print("enter the employee second name: ");
                    ce.LastName=sc.next();
                    System.out.print("enter the department name: ");
                    ce.department=sc.next();
                    System.out.print("enter the designation: ");
                    ce.designation=sc.next();
                    System.out.print("enter the salry: ");
                    ce.salary=sc.nextInt();
                    System.out.println("salary: "+ce.salary);
                    System.out.println("FullName:"+ce.FullName());
                    System.out.println("Designation: "+ce.getDesignation());
                    break;
                case 2:
                    regular_employee re=new regular_employee();
                    System.out.print("enter the employee first name: ");
                    re.FirstName=sc.next();
                    System.out.print("enter the employee second name: ");
                    re.LastName=sc.next();
                    System.out.print("enter the department name: ");
                    re.department=sc.next();
                    System.out.print("enter the designation: ");
                    re.designation=sc.next();
                    System.out.print("enter the salry: ");
                    re.salary=sc.nextInt();
                    System.out.println("salary: "+re.salary);
                    System.out.println("FullName:"+re.FullName());
                    System.out.println("Designation: "+re.getDesignation());
                    break;
                case 3:
                    System.exit(3);
                    break;
                default:
                    System.out.println("invalid input");
                    break;
            }
        }
        
    }
}