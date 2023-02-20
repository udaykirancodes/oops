import java.util.*;

class string_equal{
    String str1,str2;
    public void check()
    {
        System.out.println("equals: "+(str1.equals(str2)));

        System.out.println("ignoretestcase: "+(str1.equalsIgnoreCase(str2)));
    }
}
class string_equal_main{
    public static void main(String args[])
    {
        string_equal cmp=new string_equal();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the str1 and str2: ");
        cmp.str1=sc.next();
        cmp.str2=sc.next();
        cmp.check();
    }
}