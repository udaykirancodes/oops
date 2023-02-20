import java.util.*;
class Lights extends Thread{
    public void run()
    {
        while(true)
        {
            try{
                System.out.println("---------RED---------");
                Thread.sleep(10000);
                System.out.println("---------GREEN--------");
                Thread.sleep(10000);
                System.out.println("----------YELLOW--------");
                Thread.sleep(10000);
                }
                catch(Exception e)
                {
                     System.out.println(e);
                }
        }
    }
} 
class Trafic {
    public static void main(String[] args) {
        Lights l=new Lights();
        l.start();
    }
}
