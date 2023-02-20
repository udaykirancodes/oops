import java.util.*;

class concat_string{
    String str1,str2,str;
    public void concat(){
        str=str1.concat(str2);
    }
}
class concat_string_main{
    public static void main(String args[])
    {
        concat_string canc=new concat_string();
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the 1 string: ");
        canc.str1=sc.next();
        System.out.print("enter the 2 string: ");
        canc.str2=sc.next();
        canc.concat();
        System.out.println(canc.str);
    }
}
