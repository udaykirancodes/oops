import java.util.Arrays;
import java.util.Scanner;

public class bubble_sort {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter the length of array: ");
        int n=a.nextInt();
        int [] array=new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            array[i]=a.nextInt();
        }
        System.out.println("The array is: ");
        System.out.println(Arrays.toString(array));
        buble_sort(array);
        System.out.println("The sorted array is : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }

    public static void buble_sort(int array[]){
        int n=array.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(array[i]>array[j])
                {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
}
