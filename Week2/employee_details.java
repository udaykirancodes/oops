import java.util.*;

class employee_details{
    String name,id,designation,address,gender;
    int age,salary;
    public static void main(String[] args)
    {
        employee_details ed[]=new employee_details[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        String search;
        int n=sc.nextInt();
        int i;
        for(i=0;i<n;i++)
        {
            ed[i]=new employee_details();
            System.out.printf("Enter %d employee details\n",i+1);
            System.out.print("Name: ");
            ed[i].name=sc.next();
            System.out.print("ID: ");
            ed[i].id=sc.next();
            System.out.print("DESIGATION: ");
            ed[i].designation=sc.next();
            System.out.print("GENDER: ");
            ed[i].gender=sc.next();
            System.out.print("AGE: ");
            ed[i].age=sc.nextInt();
            System.out.print("SALARY: ");
            ed[i].salary=sc.nextInt();
            System.out.print("ADDRESS: ");
            ed[i].address=sc.next();
        }
        System.out.print("Enter the id of employee to search: ");
        search=sc.next();
        for(i=0;i<n;i++)
        {
            if(search.equals(ed[i].id))
            {
                break;
            }
        }
        if(i==n)
        {
            System.out.println("not found");
        }
        else{
            System.out.printf("Name: %s\n",ed[i].name);
            System.out.printf("ID: %s\n",ed[i].id);
            System.out.printf("DESINATION: %s\n",ed[i].designation);
            System.out.printf("AGE: %d\n",ed[i].age);
            System.out.printf("GENDER: %s\n",ed[i].gender);
            System.out.printf("SALARY: %d\n",ed[i].salary);
            System.out.printf("ADDRESS: %s\n",ed[i].address);
        }
    }
    // public void employee_search(String search)
    // {
        
    // }
}
