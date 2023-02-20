import java.util.Scanner;
class Binary_search {
	int n,p;
	int [] arr=new int[100];
    public void sort(){
	int i,temp,j;
	for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public void binary_search(int l,int h)
    {
        if(l<=h)
        {
            int i,mid=(l+h)/2;
            if(arr[mid]==p)
                System.out.println("found");
            else if(arr[mid]<p)
                binary_search(mid+1,h);
            else
                binary_search(l,mid-1);
        }
        else
        {
            System.out.println("not found");
        }

    }
}
class Binary_search_main{
     public static void main(String[] args) {
	Binary_search bs=new Binary_search();
        System.out.println("Enter the size of array: ");
        Scanner sc=new Scanner(System.in);
        bs.n=sc.nextInt();
        System.out.println("Enter the array elements: ");
        for(int i=0;i<bs.n;i++)
        {
            bs.arr[i]=sc.nextInt();
        }
        System.out.println("Enter element to search: ");
        bs.p=sc.nextInt();
	bs.sort();
        bs.binary_search(0,(bs.n)-1);
    }
}