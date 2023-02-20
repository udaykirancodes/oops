import java.util.Scanner;

public class merge_sort{
    int n;
    int arr[]=new int[100];
    public void mergesort(int l,int h)
    {
        int mid;
        if(l<h) {
            mid = (l + h) / 2;
            mergesort(l, mid);
            mergesort(mid + 1, h);
            merge(l, mid, h);
        }
    }
    public void merge(int l,int m,int h)
    {
        int i=l,j=m+1,k=l;
        int[] c=new int[20];
        if(l<h)
        {
            while(i<=m && j<=h)
            {
                while(i<=m && arr[i]<=arr[j])
                {
                    c[k]=arr[i];
                    i++;
                    k++;
                }
                while(j<=h && arr[j]<=arr[i])
                {
                    c[k]=arr[j];
                    j++;
                    k++;
                }
            }
            while(i<=m)
            {
                c[k]=arr[i];
                i++;
                k++;
            }
            while(j<=h)
            {
                c[k]=arr[j];
                j++;
                k++;
            }
            int p;
            for(p=l;p<k;p++)
            {
                arr[p]=c[p];
            }
        }
    }


}
class Merge_main{
    public static void main(String[] args) {
        merge_sort ms=new merge_sort();
        System.out.println("Enter the size of array: ");
        Scanner sc=new Scanner(System.in);
        ms.n=sc.nextInt();
        System.out.println("Enter the array elements: ");
        for(int i=0;i<ms.n;i++)
        {
            ms.arr[i]=sc.nextInt();
        }
        ms.mergesort(0,(ms.n)-1);
        System.out.println("After sorting array elements: ");
        for(int j=0;j<ms.n;j++)
        {
            System.out.print(ms.arr[j]+" ");
        }
    }
}

