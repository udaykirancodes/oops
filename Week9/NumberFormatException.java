import java.util.*;
class NFException{
    void convert(String s) throws NumberFormatException
    {
        int n=Integer.parseInt(s);
        System.out.println(n);
    }
}
class NumberFormatExceptionMain{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=new String();
        System.out.println("enter the String: ");
        s=sc.next();
        NFException nf=new NFException();
        try{
            nf.convert(s);
        }
        catch(NumberFormatException nfe)
        {
            System.out.println(nfe);
        }
        finally{
            System.out.println("Finally block");
        }
    }
}
