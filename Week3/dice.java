import java.util.*;
import java.util.concurrent.TimeUnit;
class dice{
    int count=0;
    public void roll(int n)
    {
        int i=0;
        Scanner sc=new Scanner(System.in);
        int dice1,dice2;
        for(i=0;i<n;i++)
        {
            Random r=new Random();
            dice1=r.nextInt(6);
            dice2=r.nextInt(6);
            System.out.println("processing");
            try{
                // TimeUnit.SECONDS.sleep(1);
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println("Interupt");
            }
            if(dice1==dice2)
            {
                count++;
                System.out.println(count);
            }
        }

    }
}
class dice_main{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of times that you want to roll the dice: ");
        n=sc.nextInt();
        dice roll_dice=new dice();
        roll_dice.roll(n);
        System.out.print("Number of successful attempts"+roll_dice.count);
    }
}