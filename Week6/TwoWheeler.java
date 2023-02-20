import java.util.*;
import java.util.zip.GZIPOutputStream;
class Geared extends two_wheeler {
    String type,name;
    public void type(){
        System.out.println("Geared");
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    } 
    public void average(int dis){
        System.out.println("The vehical can run "+dis+"km per liter");
    }
}
class NonGeared extends two_wheeler{
    String type,name;
    public void type(){
        System.out.println("Non Geared");
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    } 
    public void average(int dis){
        System.out.println("The vehical can run "+dis+"kmliter");
    }
}
class TwoWheeler_main{
    public static void main(String[] args) {
        int option;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1.Geared\n2.NonGeared\n3.exit\n");
            option=sc.nextInt();
            switch(option)
            {
                case 1:
               Geared g=new Geared();
               System.out.print("enter the Name of the Vehicle company: ");
               g.setName(sc.next());
                System.out.print("enter the vehical number: ");
                g.vehicle_number=sc.nextInt();
                System.out.print("enter the vehical insurence number: ");
                g.insurence_number=sc.next();
                System.out.print("enter the color of vehical: ");
                g.color=sc.next();
                System.out.print("enter the fuel tank it consumes: ");
                g.setConsumption(sc.nextInt());
                System.out.println("\n-----------------------------------------\n");
                System.out.println("Details of vehical: ");
                System.out.println("vehical Number: "+g.vehicle_number);
                System.out.println("insurence number: "+g.insurence_number);
                System.out.println("color: "+g.color);
                System.out.println("enter the maintanece years: ");
                g.maintenance(sc.nextInt());
                System.out.println("enter the mailage in km: ");
                g.average(sc.nextInt());
                System.out.println("\n-----------------------------------------\n");
                break;
            case 2:
                NonGeared ng=new NonGeared();
                System.out.print("enter the Name of the Vehicle company: ");
                ng.setName(sc.next());
                System.out.print("enter the vehical number: ");
                ng.vehicle_number=sc.nextInt();
                System.out.print("enter the vehical insurence number: ");
                ng.insurence_number=sc.next();
                System.out.print("enter the color of vehical: ");
                ng.color=sc.next();
                System.out.print("enter the fuel tank it consumes: ");
                ng.setConsumption(sc.nextInt());
                System.out.println("\n-----------------------------------------\n");
                System.out.println("Details of vehical: ");
                System.out.println("vehical Number: "+ng.vehicle_number);
                System.out.println("insurence number: "+ng.insurence_number);
                System.out.println("color: "+ng.color);
                System.out.println("enter the maintanece years: ");
                ng.maintenance(sc.nextInt());
                System.out.println("enter the mailage in km: ");
                ng.average(sc.nextInt());
                System.out.println("\n-----------------------------------------\n");
                break;
            case 3:
                System.exit(option);    
            default:
                System.out.println("invalid input");
                break;
            }
        }
    }
}
