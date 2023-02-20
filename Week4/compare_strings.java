import java.util.*;

class compare{
    String str1,str2;
    public void check()
    {
        System.out.println(str1.compareTo(str2));
    }
}
class compare_strings_main{
    public static void main(String args[])
    {
        compare cmp=new compare();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the str1 and str2: ");
        cmp.str1=sc.next();
        cmp.str2=sc.next();
        cmp.check();
    }
}