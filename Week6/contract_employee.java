import java.util.*;

class HowerlyEmployee extends contract_emloyee{
    int NumberOfHours,WagesPerHour;
    public void setNumberOfHours(int numberOfHours) {
        NumberOfHours = numberOfHours;
    }
    public void setWagesPerHour(int wagesPerHour) {
        WagesPerHour = wagesPerHour;
    }
    public int calculateWages()
    {
        return NumberOfHours*WagesPerHour;
    }
}
class WeeklyEmployee extends contract_emloyee{
    int NumberofWeeks,WagesPerWeek;
    public void setNumberofWeeks(int numberofWeeks) {
        NumberofWeeks = numberofWeeks;
    }
    public void setWagesPerWeek(int wagesPerWeek) {
        WagesPerWeek = wagesPerWeek;
    }
    public int calculateWages(){
        return NumberofWeeks*WagesPerWeek;
    }
}
class contract_employee_main{
    public static void main(String[] args) {
        int option;
        Scanner sc=new Scanner(System.in);
        while(true )
        {
            System.out.println("1.HourlyEmployee\n2.WeeklyEmployee\n3.EXIT");
            System.out.println("choose any option: ");
            option=sc.nextInt();
            switch(option)
            {
                case 1:
                    HowerlyEmployee he=new HowerlyEmployee();
                    System.out.print("enter the employee first name: ");
                    he.FirstName=sc.next();
                    System.out.print("enter the employee second name: ");
                    he.LastName=sc.next();
                    System.out.print("enter the department name: ");
                    he.department=sc.next();
                    System.out.print("enter the designation: ");
                    he.designation=sc.next();
                    System.out.print("enter the Hours to work: ");
                    he.NumberOfHours=sc.nextInt();
                    System.out.print("enter the wages per hour: ");
                    he.WagesPerHour=sc.nextInt();
                    System.out.println("---------------------------------------------\n");
                    System.out.println("salary: "+he.calculateWages());
                    System.out.println("FullName:"+he.FullName());
                    System.out.println("Designation: "+he.getDesignation());
                    System.out.println("---------------------------------------------\n");
                    break;
                case 2:
                    WeeklyEmployee we=new WeeklyEmployee();
                    System.out.print("enter the employee first name: ");
                    we.FirstName=sc.next();
                    System.out.print("enter the employee second name: ");
                    we.LastName=sc.next();
                    System.out.print("enter the department name: ");
                    we.department=sc.next();
                    System.out.print("enter the designation: ");
                    we.designation=sc.next();
                    System.out.print("enter the Weeks to work: ");
                    we.NumberofWeeks=sc.nextInt();
                    System.out.print("enter the wages per week: ");
                    we.WagesPerWeek=sc.nextInt();
                    System.out.println("---------------------------------------------\n");
                    System.out.println("salary: "+we.calculateWages());
                    System.out.println("FullName:"+we.FullName());
                    System.out.println("Designation: "+we.getDesignation());
                    System.out.println("\n---------------------------------------------\n");
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