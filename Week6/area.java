import java.util.Scanner;

class area{
    public double area(int radius,int height)
    {
        return (1/4)*3.14*radius*radius*height;
    }
    public double area(int radius)
    {
        return 3.14*radius*radius; 
    }
    public float area(Float length,int height)
    {
        return length*height;
    }
    public float area(Float length)
    {
        return length*length;
    }
}
class area_main{
    public static void main(String[] args) {
        int r,h;
        float l;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius: ");
        r=sc.nextInt();
        System.out.println("enter the length:");
        l=sc.nextFloat();
        System.out.println("enter the height");
        h=sc.nextInt();
        area a=new area();
        System.out.println("the are cylinder: "+a.area(r,h));
        System.out.println("area of the circle: "+a.area(r));
        System.out.println("area of the rectacnglr: "+a.area(l,h));
        System.out.println("area of square: "+a.area(l));
    }
}