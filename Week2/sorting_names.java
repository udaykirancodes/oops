import java.util.*;
import java.lang.*;

class sorting_names{
    String [] str=new String[100];
    int n;
    public void sort(){
        int  i,j;
        String temp;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(str[i].compareTo(str[j])<0)
                {
                    temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
    }
}
class sorting_names_main{
    public static void main(String[] args)
    {
    sorting_names sn=new sorting_names();
    System.out.print("enter the number of names: ");
    Scanner sc=new Scanner(System.in);
    sn.n=sc.nextInt();
    int i;
    System.out.println("Enter the name: ");
    for(i=0;i<sn.n;i++)
    {
        sn.str[i]=sc.next();
    }
    sn.sort();
    System.out.println("names after sorting: ");
    for(i=0;i<sn.n;i++)
    {
        System.out.print(sn.str[i]+" ");
    }
    }
}