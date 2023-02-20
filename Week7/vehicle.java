import java.util.*;
interface vehicle {
    String getColor();
    String getNumber();
    int getConsumption();
}
class twoWheeler implements vehicle{
    public String getColor()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the color of vehicle: ");
        return sc.next();
    }
    public String getNumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of vehicle");
        return sc.next();
    }
    public int getConsumption()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the fuel consumed by the vehicle: ");
        return sc.nextInt();
    }
}
class fourWheeeler implements vehicle{
    public String getColor()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the color of vehicle: ");
        return sc.next();
    }
    public String getNumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of vehicle");
        return sc.next();
    }
    public int getConsumption()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the fuel consumed by the vehicle: ");
        return sc.nextInt();
    }
}
class vehicle_main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int option;
        twoWheeler tw=new twoWheeler();
        fourWheeeler fw=new fourWheeeler();
        while(true)
        {
            System.out.println("1.TwoWheeler\n2.FourWheeler\n3.Exit\n");
            System.out.println("choose option: ");
            option=sc.nextInt();
            switch(option)
            {
                case 1: 
                    System.out.println("The color of the vehicle:   "+tw.getColor());
                    System.out.println("vehicle Number: "+tw.getNumber());
                    System.out.println("The fuel consumed by the vehicle: "+tw.getConsumption());
                    break;
                case 2:
                    System.out.println("The color of the vehicle:   "+fw.getColor());
                    System.out.println("vehicle Number: "+fw.getNumber());
                    System.out.println("The fuel consumed by the vehicle: "+fw.getConsumption());
                    break;
                case 3:
                    System.exit(option);
            }
        }
    }
}
