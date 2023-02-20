import java.util.*;
public class callByValue {
    int temp;
    public void print(int a)
    {
        this.temp=a;
        System.out.println("call by value: "+temp);
    }
    public void print1(){
        System.out.println("this is call By objects");
    }
    public void print(callByValue c)
    {
        c.temp=5;
        c.print1();
    }
}
class callByValue_main{
    public static void main(String[] args) {
        callByValue c=new callByValue();
        c.print(10);
        c.print(new callByValue());
    }
}
