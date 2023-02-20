import java.util.*;
public class keyWords {
    private int a,b;
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    int  add()
    {
        return (getA()+getB());
    }
}
class add2 extends keyWords{
    private int  c;
    public void setC(int c) {
        this.c = c;
    }
    public int getC() {
        return c;
    }
    public void add1(){
        System.out.println("sum: "+(super.add()+getC()));
    }
}
class keyWords_main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        add2 a=new add2();
        System.out.println("enter a b c value");
        a.setA(sc.nextInt());
        a.setB(sc.nextInt());
        a.setC(sc.nextInt());
        a.add1();
    }
}

