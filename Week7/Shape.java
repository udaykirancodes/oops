import java.util.*;
abstract class Shape {
    abstract void  getarea();
    abstract void getvolume();
}
abstract class square extends Shape{
    public void getarea()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of square: ");
        int l=sc.nextInt();
        System.out.println("area: "+l*l);
    }
    abstract void getvolume();
    // {
    //     System.out.println("There is no value for volume square");
    // }
}
abstract class circle extends Shape{
    public void getarea()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of circle: ");
        int r=sc.nextInt();
        System.out.println("area: "+3.14*r*r);
    }
    abstract void getvolume();
    // {
    //     System.out.println("there is no volume in java: ");
    // }
}
class cube extends square{
    // public void getarea()
    // {
    //     System.out.println("there is no area  in java");
    // }
    public void getvolume()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of cube: ");
        int l=sc.nextInt();
        System.out.println(4*3.14*l*l);
    }
}
class spear extends circle{
    // public void getarea()
    // {
    //     System.out.println("there is no area for spear");
    // }
    public void getvolume()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of spear: ");
        int r=sc.nextInt();
        System.out.println((4/3)*3.14*r*r);   
    }
}
class Shape_main{
    public static void main(String[] args) {
        // square s2=new square();
        // circle c2=new circle();
        cube c3=new cube();
        spear s3=new spear();
        Scanner sc=new Scanner(System.in);
        int option;
        while(true)
        {
            System.out.println("1.Sqare\n2.circle\n3.Cube\n4.Spear\n5.exit\n");
            System.out.println("enter the option: ");
            option=sc.nextInt();
            switch(option)
            {
                case 1:
                    c3.getarea();
                    break;
                case 2:
                    s3.getarea();
                    break;
                case 3:
                    s3.getvolume();
                    break;
                case 4:
                    c3.getvolume();
                    break;
                case 5:
                    System.exit(option);
                default:
                    System.out.println("invalid signature");
                    break;

            }
        }
    }
}