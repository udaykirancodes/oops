 /*Write a JAVA program for the following 
a. Call by value b. Call by object */
import java.util.*;
class callbyobject
{
    int a=10;
    void display(int a)
    {
        obj.a=obj.a+100;
        System.out.println(obj.a);
    }
    public static void main(String[] arg)
    {
        callbyobject c=new callbyobject();
        System.out.println(c.a);
        display(obj.a);
        System.out.println("After calling: "+obj.a);
    }
}