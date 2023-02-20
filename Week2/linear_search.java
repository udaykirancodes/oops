import java.util.*;

class linear_search {
    int n;

    int array[]=new int[100];
    public void search(int x) {
        int flag=0,i;
        for(i=0;i<n;i++)
        {
            if(array[i]==x)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("The element not found");
        }
        else
        {
            System.out.print("The element found at posistion: ");
            System.out.print(i);
        }
    }
}
class linear_search_main{
    public static void main(String[] args) {
        linear_search ls=new linear_search();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        ls.n=sc.nextInt();
        System.out.println("Enter the arraya elements: ");
        for(int i=0;i<ls.n;i++)
        {
            ls.array[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search: ");
        int x=sc.nextInt();
        ls.search(x);
    }
}
