import java.util.*;

public class subString {
    String s;
    public void setS(String s) {
        this.s = s;
    }
    public void sub(){
        System.out.println(s.substring(4,7));
    }
}
class subString_main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        subString ss=new subString();
        System.out.println("enter the string: ");
        ss.s=sc.next();
        ss.sub();
    }
}