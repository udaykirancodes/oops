import java.util.Scanner;

import calculator.add;
import calculator.sub;
import calculator.mul;
import calculator.div;
import calculator.mod;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        int option;
        while(true)
        {
            System.out.println("enter the a value a and b values: ");
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.mod\n");
            System.out.println("choose option: ");
            option=sc.nextInt();
            switch (option) {
                case 1:
                    add ad=new add();
                    System.out.println("Sum: "+ad.add(a, b));
                    break;
                case 2:
                    sub s=new sub();
                    System.out.println("difference: "+s.sub(a, b));
                    break;
                case 3:
                    mul m=new mul();
                    System.out.println("product: "+m.mul(a, b));
                    break;
                case 4:
                    div d=new div();
                    System.out.println("Division:   "+d.div(a, b));
                    break;
                case 5:
                    mod m2=new mod();
                    System.out.println("Modulo: "+m2.mod(a, b));
                    break;
                case 6:
                    System.exit(option);
                default:
                    System.out.println("invalid input");
            }
        }
    }
    
}
