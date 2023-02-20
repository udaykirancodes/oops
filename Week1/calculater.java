import java.util.*;
import java.math.*;

class calculater {
    int a;
    int b;
    public static void main(String[] args) {
        calculater c=new calculater();
        c.read();
        c.add();
        c.sub();
        c.mul();
        c.div();
        c.modulo();
        }
    public void read() {
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter a & b values");
        a=sc.nextInt();
        b=sc.nextInt();
    }
    public void add()
    {
        System.out.println(a+b);
    }
    public void sub()
    {
        System.out.println(a-b);
    }
    public void mul()
    {
        System.out.println(a*b);
    }
    public void div()
    {
        System.out.println(a/b);
    }
    public void modulo()
    {
        System.out.println(a%b);
    }
}
