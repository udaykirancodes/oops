import java.util.Scanner;

class add2{
    int a,b;
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public  int add()
    {
        return a+b;
    }
    public int add(int a,int b)
    {
        return a+b;
    }
}
class add3 extends add2{
    int c;
    public void setC(int c) {
        this.c = c;
    }
    public int add()
    {
        return super.add()+c;
    }
}
class add_main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        add3 ad=new add3();
        add2 a=new add2();
        System.out.println("enter the values of a,b,c");
        ad.setA(sc.nextInt());
        ad.setB(sc.nextInt());
        ad.setC(sc.nextInt());
        //method override
        System.out.println(ad.add());
        //method overload
        System.out.println(ad.add(3,2));
    }
}