import java.util.*;

class matrix_addition{
    int n,m;
    int arr1[][]=new int[100][100];
    int arr2[][]=new int[100][100];
    int result[][]=new int[100][100];
    public void addition(){
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                result[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
    }
}
class matrix_addition_main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        matrix_addition ma=new matrix_addition();
        System.out.print("Enter the number of rows: ");
        ma.n=sc.nextInt();
        System.out.print("Enter the number of columns: ");
        ma.m=sc.nextInt();
        int i,j;
        System.out.println("Enter the 1st array elements: ");
        for(i=0;i<ma.n;i++)
        {
            for(j=0;j<ma.m;j++)
            {
                ma.arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the 2nd array elements: ");
        for(i=0;i<ma.n;i++)
        {
            for(j=0;j<ma.m;j++){
                ma.arr2[i][j]=sc.nextInt();
            }
        }
        ma.addition();
        System.out.println("result addition matrices: ");
        for(i=0;i<ma.n;i++)
        {
            for(j=0;j<ma.m;j++)
            {
                System.out.print(ma.result[i][j]+" ");
            }
            System.out.println();
        }
    }
}