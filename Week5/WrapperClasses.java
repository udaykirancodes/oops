import java.lang.Integer;//no need
import java.lang.Double;
import java.util.Scanner;

class WrapperClasses
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    System.out.print("Enter an integer : ");
    int a=in.nextInt();
    System.out.print("Enter a float/double : ");
    double b=in.nextDouble();
                    
    Integer aObj = Integer.valueOf(a);
    Double bObj = Double.valueOf(b);

    System.out.println("int is now an object and value is : "+aObj.intValue());
    System.out.println("double is now an object and value is : "+bObj.doubleValue());
  }
}