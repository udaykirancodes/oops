import java.util.*;
class NewException{
    NewException(String s) throws Exception
    {
        if(s.length()>10)
        {
            throw new Exception("String Argument");
        }
    }
}
class ThrowThrows{
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            String s;
            System.out.println("enter the string: ");
            s=sc.next();
            NewException n=new NewException(s);
        }
        catch(Exception  e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("end of the code");
        }
      }
}