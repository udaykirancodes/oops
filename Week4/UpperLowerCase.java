import java.util.*;

class UpperLowerCase{
    String s;
    public void setS(String s) {
        this.s = s;
    }
    public void lower(){
        System.out.println(s.toLowerCase());
    }
    public void upper(){
        System.out.println(s.toUpperCase());
    }
}
class UpperLowerCase_main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        UpperLowerCase ul=new UpperLowerCase();
        System.out.println("enter string: ");
        ul.s=sc.next();
        ul.lower();
        ul.upper();
    }
}