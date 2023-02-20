import java.util.*;

import org.xml.sax.SAXException;
interface fare {
   public void getamount(); 
}
class bus implements fare{
    public void getamount()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the fare amount paid for bus travelling:  ");
        int amount=sc.nextInt();
        System.out.println("fare amount for bus travelling:     "+amount);
    }
}
class train implements fare{
    public void getamount()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the fare amount paid for train travelling: ");
        int amount=sc.nextInt();
        System.out.println("Fare amount paid for Train travelling:  "+amount);
    }
}
class traveling{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int option;
        bus b=new bus();
        train t=new train();
        while(true)
        {
            System.out.println("1.BUS\n2.TRAIN\n3.EXIT");
            System.out.println("Choose option: ");
            option=sc.nextInt();
            switch(option)
            {
                case 1:
                    b.getamount();
                    break;
                case 2:
                    t.getamount();
                    break;
                case 3:
                    System.exit(option);
            }
        }
    }
}
