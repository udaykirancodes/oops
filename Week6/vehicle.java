import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

public class vehicle {
    int vehicle_number,consumption;
    String color,insurence_number;
    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }
    public int getConsumption() {
        return consumption;
    }
    public void displayConsumption(){
        System.out.println("The veihical will consume"+" "+consumption+" fuel");
    }
}
class two_wheeler extends vehicle{
    public void maintenance(int year){
        System.out.println("The vehical need maintanence in every "+year+"years");
    }
    public void average(int dis){
        System.out.println("The vehical can run "+dis+"km per liter");
    }
}
class four_wheeler extends vehicle{
    public void maintenance(int year){
        System.out.println("The vehical need maintanence in every "+year+"years");
    }
    public void average(int dis){
        System.out.println("The vehical can run "+dis+"km per liter");
    }
}
class vehicle_main{
    public static void main(String[] args) {
        int option;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("1.two wheeler\n2.Four wheeler\n3.EXIT\n");
            System.out.println("choose option: ");
            option=sc.nextInt();
            switch(option)
            {
                case 1:
                    two_wheeler tw=new two_wheeler();
                    System.out.print("enter the vehical number: ");
                    tw.vehicle_number=sc.nextInt();
                    System.out.print("enter the vehical insurence number: ");
                    tw.insurence_number=sc.next();
                    System.out.print("enter the color of vehical: ");
                    tw.color=sc.next();
                    System.out.print("enter the fuel tank it consumes: ");
                    tw.setConsumption(sc.nextInt());
                    System.out.println("\n-----------------------------------------\n");
                    System.out.println("Details of vehical: ");
                    System.out.println("vehical Number: "+tw.vehicle_number);
                    System.out.println("insurence number: "+tw.insurence_number);
                    System.out.println("color: "+tw.color);
                    System.out.println("enter the maintanece years: ");
                    tw.maintenance(sc.nextInt());
                    System.out.println("enter the mailage in km: ");
                    tw.average(sc.nextInt());
                    System.out.println("\n-----------------------------------------\n");
                    break;
                case 2:
                    four_wheeler fw=new four_wheeler();
                    System.out.print("enter the vehical number: ");
                    fw.vehicle_number=sc.nextInt();
                    System.out.print("enter the vehical insurence number: ");
                    fw.insurence_number=sc.next();
                    System.out.print("enter the color of vehical: ");
                    fw.color=sc.next();
                    System.out.print("enter the fuel tank it consumes: ");
                    fw.setConsumption(sc.nextInt());
                    System.out.println("\n-----------------------------------------\n");
                    System.out.println("Details of vehical: ");
                    System.out.println("vehical Number: "+fw.vehicle_number);
                    System.out.println("insurence number: "+fw.insurence_number);
                    System.out.println("color: "+fw.color);
                    System.out.println("enter the maintanece years: ");
                    fw.maintenance(sc.nextInt());
                    System.out.println("enter the mailage in km: ");
                    fw.average(sc.nextInt());
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