/*Write a JAVA program for the following 
a. Call by value b. Call by object */
import java.util.*;
class callbyvalue
{
    int a=10;
    void display(int a)
    {
        a=a+100;
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        callbyvalue c=new callbyvalue();
        System.out.println(c.a);
        c.display(20);
        System.out.println("After calling "+c.a);
    }
}