import java.util.*;

class index_of{
    String str;
    public int count(int i,char p){
        if(i<str.length())
        {
            int r=(str.indexOf(p,i));
           if(r!=-1)
            {
                return 1+count(r+1,p);
            }
        }
        return 0;
    }
}
class index_of_main{
    public static void main(String args[])
    {
        index_of index=new index_of();
        Scanner sc=new Scanner(System.in);
         System.out.print("enter the string: ");
         index.str=sc.next();
        char search;
       System.out.print("Enter the char to search: ");
       search=sc.next().charAt(0);
        System.out.println((index.count(0,search)));

    }
}
