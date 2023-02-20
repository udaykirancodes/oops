import java.util.*;

public class Account {
    double balance,acc_balance;
    String acc_name,acc_number,acc_aaddres;
    Account(double m){
        balance=m;
        acc_balance=balance;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name: ");
        acc_name=sc.next();
        System.out.println("enter the account Number: ");
        acc_number=sc.next();
        System.out.println("account address: ");
        acc_aaddres=sc.next();
    }
    public void credit(int amount){
        acc_balance=acc_balance+amount;
    }
    public void debit(int amount){
        if(acc_balance<amount)
        {
            System.out.println("“Debit amount exceeded account balance");
            getBalance();
        }
        else{
            acc_balance=acc_balance-amount;
            getBalance();
        }
    }
    public void getBalance(){
        System.out.println("Balance: "+acc_balance);
    }
}
class Account_main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount in banck");
        Account ac=new Account(sc.nextInt());
        int option;
        while(true)
        {
            System.out.println("1.CREDIT\n,2.DEBIT\n3GETBALANCE\n4.exit");
            System.out.println("choose option: ");
            option=sc.nextInt();
            switch(option){
                case 1:
                    System.out.println("enter the amount to credit: ");
                    ac.credit(sc.nextInt());
                    break;
                case 2:
                    System.out.println("enter the amount to withdra: ");
                    ac.debit(sc.nextInt());
                    break;
                case 3:
                    ac.getBalance();
                    break;
                case 4:
                    System.exit(option);
                    break;
                default:
                    System.out.println("invalid");
            }  
        }
        
    }
}
