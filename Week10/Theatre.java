import java.util.Scanner;

//each person is a thread
class Person extends Thread
{
   int n;
   Person(int n)
   {
     this.n=n; 
   }
   
   public void run()
   {
      try
      {
        System.out.println("person"+n+" bought ticket");
        Thread.sleep(2000);
        System.out.println("person"+n+" shown ticket to the boy");
        Thread.sleep(2000);
        System.out.println("person"+n+" enterd theatre");
      }
      catch(InterruptedException e)
      {}
   }
}

class Theatre
{
   public static void main(String args[])
   {
      Scanner in=new Scanner(System.in);
      System.out.println("How many persons : ");
      int n=in.nextInt();
      Person p;
      for(int i=1;i<=n;i++)
      {
       p=new Person(i); //i is person number
       p.start();
        try
        {
        Thread.sleep(900);  //time gap between person to person<gap between person tasks.  i.e., 900ms < 2000 ms
        }
        catch(Exception e){}
      }
   }
}

//output depends on time gaps
//donn't depend on for loop for delay