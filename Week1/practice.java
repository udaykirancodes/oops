import java.util.*;
class Main{
    public static void main(String[] args)
    {
         int n;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
         n=sc.nextInt();
         int count=0;
         int temp=n,rem;
         double sum=0.0;
         while(temp>0){
            temp=temp/10;
            count++;
         }
         temp=n;
         while(temp>0){
             rem=temp%10;
             sum=sum+Math.pow(rem,count);
             temp=temp/10;
         }
         if(n==sum){
            System.out.println("Armstrong number");
         }
         else{
            System.out.println("Not armstrong number");
         }
    }
}