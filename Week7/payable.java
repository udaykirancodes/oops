import java.util.*;

import javax.print.StreamPrintService;

interface payable {
    public void getamount();
}
class employee implements payable{
    public void getamount()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of Months an employee worked: ");
        int n=sc.nextInt();
        System.out.println("enter the salaryof an employee:   ");
        int m=sc.nextInt();
        System.out.println("------------------------------------------");
        System.out.println("The number months worked: "+n);
        System.out.println("Salary per month: "+m);
        System.out.println("Salary: "+n*m);
        System.out.println("----------------------------------------------");
    }
}
class payable_main{
    public static void main(String[] args) {
        employee e=new employee();
        e.getamount();
    }
}
