import java.util.*;
public class StringReverse {
   String  s,reverse="";
   public void setS(String s) {
       this.s = s;
   } 
   public void reverse(){
        int n=s.length();
        int j=n-1;
        while(j>=0)
        {
            reverse=reverse+s.charAt(j);
            j--;
        }
        System.out.println("String : "+reverse);
   }
}
class StringReverse_main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringReverse sr=new StringReverse();
        System.out.println("enter the string: ");
        sr.s=sc.next();
        sr.reverse();
    }
}
