import java.util.*;

public class RethrowException{
    void  meth2() throws ArrayIndexOutOfBoundsException
    { 
        int arr[]=new int[]{1,2,3,4};
        int c=arr[1]/arr[7];
    }
    void meth1() throws ArrayIndexOutOfBoundsException
    {
        meth2();
    }
}
class Main{
    public static void main(String[] args) {
        RethrowException rt=new RethrowException();
        try{
            rt.meth1();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("completed");
        }
    }
}
