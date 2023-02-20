import java.io.BufferedReader;
import java.nio.Buffer;
import java.util.*;
class entry extends Thread{
    int ticket;
    int n=0;
    synchronized public void run()
    {
        if(ticket!=0)
        {
            System.out.println(n+1);
        }
    }
    public void setN(int n) {
        this.n = n;
    }
}
class Theater {
    public static void main(String[] args) {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of customers: ");
        n=sc.nextInt();
        entry e[]=new entry[n];
        System.out.println("1.YES\n2.NO\n");
        for(i=0;i<n;i++)
        {
            e[i]=new entry();
            e[i].setN(i);
            System.out.println("is coustemer"+(i+1)+"taken ticket: ");
            e[i].ticket=sc.nextInt();

        }
        System.out.println("order of sequence: ");
        for(i=0;i<n;i++)
        {
            e[i].start();
        }

    }
}
