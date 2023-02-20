import java.util.*;
import java.util.stream.IntStream;

class Unique_values{
    // int arr[]=new int[100];
     List<Integer> lis=new ArrayList<>();
    public static void main(String []args)
    {
        int n;
        System.out.print("Enter the n value: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        Unique_values uv=new Unique_values();
        uv.read(n);
    }
    public void read(int n){
        Scanner sc=new Scanner(System.in);
        int i=0;
        
        while(i<n)
        {
            int p=sc.nextInt();
            if(!lis.contains(p)){
                // arr[i]=p;
                lis.add(p);
                i++;
                display(i);
            }
            else{
                System.out.println("Already entered this elemnt");
            }
        }
    }
    public void display(int n)
    {
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print(lis.get(i)+" ");
        }
        System.out.println();
    }
}