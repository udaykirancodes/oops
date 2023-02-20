import java.util.*;

class product_sell{
    String product_name;
    int product_id;
    double product_price,sold_price;
    int product_quantity;
    public void setter(int i){
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the product_%d name: ",i+1);
            product_name=sc.next();
            System.out.printf("Enter the product_%d id: ",i+1);
            product_id=sc.nextInt();
            System.out.printf("Enter the product_%d quatity: ",i+1);
            product_quantity=sc.nextInt();
            System.out.printf("Enter the product_%d price: ",i+1);
            product_price=sc.nextDouble();
    }
}
class product_sell_main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        product_sell ps[]=new product_sell[n];
        //read the values of product each product 
        int i;
        for(i=0;i<n;i++)
        {
            ps[i]=new product_sell();
            ps[i].setter(i);
        }
        int product_id,product_quantity;
        double sum=0;
        int flag=0;
        do
        {
            System.out.printf("1.Purchase\n2.exit\n\n");
            System.out.print("Enter the option: ");
            int option=sc.nextInt();
            switch(option)
            {
                case 1:
                    System.out.print("Enter the product id: ");
                    product_id=sc.nextInt();
                    System.out.print("Enter the product purschase_quantity ");
                    product_quantity=sc.nextInt();
                    for(i=0;i<n;i++)
                    {
                        if(product_id==ps[i].product_id && product_quantity<=ps[i].product_quantity)
                        {
                            sum=sum+(ps[i].product_price)*product_quantity;
                            System.out.println(ps[i].product_name+" "+(ps[i].product_price)*product_quantity);
                            ps[i].product_quantity=ps[i].product_quantity-product_quantity;
                            break;
                        }
                    }
                    if(i==n)
                    {
                        System.out.println("We don't have such product");
                    }
                    break;
                case 2:
                    flag=1;
                    break;
                default:
                    System.out.println("There is  no such product");
                    break;
            }
        }while(flag!=1);
        System.out.print("The total retail price: ");
        System.out.print(sum);
    }
}
