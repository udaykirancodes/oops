import java.util.*;

class string_length{
    String str;
    public int len(){
        return  str.length();
    }
}
class string_length_main{
    public static void main(String args[])
    {
        string_length st=new string_length();
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string: ");
        st.str=sc.next();
        System.out.println(st.len());

    }
}
