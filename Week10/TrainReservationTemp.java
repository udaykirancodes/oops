import java.util.Scanner;
class Berths
{
  int avlberths=50;
  synchronized void berthAllotment(int reqberths)
  {
    if(reqberths<=avlberths)
    {
      System.out.println(Thread.currentThread().getName());
      System.out.println("your berth allotment is successful");
      System.out.println("your ticket is printed");
      avlberths-=reqberths;
    }
    else 
    {
      System.out.println("no berths are available");
    }
  }
}

class P1 extends Thread
{
  Berths b;
  P1(Berths b)
   {
     this.b=b;
    }

  public void run()
  {
    b.berthAllotment(10);
  }
}

class P2 extends Thread
{
  Berths b; 
  P2(Berths b)
  {
    this.b=b;
  }

  public void run()
  {
    b.berthAllotment(10);
  }
}

class P3 extends Thread
{
  Berths b; 
  P3(Berths b)
   {
    this.b=b;
   }  
  public void run()
  {
    b.berthAllotment(10);
  }
}

class TrainReservationTemp
{
  public static void main(String args[])
  {
    Berths b=new Berths();
    P1 t1=new P1(b);
    P2 t2=new P2(b);
    P3 t3=new P3(b);
    t1.setName("Passenger 1");
    t2.setName("Passenger 2");
    t3.setName("passenger 3");
    t1.start();
    t2.start();
    t3.start();
  }
}