import java.util.*;
class NewClass{
    void print()
    {
        System.out.println("JAVA");
    }
}
public class ClsNotFoundException {
    public static void main(String[] args) {
        try{
            NewClass nc=new NewClass();
            nc.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
