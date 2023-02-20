import java.util.*;
class  NewException extends Exception{
    public String toString()
    {
        return ("String length out of bound");
    }
}
class UserException {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("enter the string: ");
        s=sc.next();
        try{
            if(s.length()>10)
            {
                throw new NewException();
            }
        }
        catch(NewException e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("final block");
        }
    }
}
