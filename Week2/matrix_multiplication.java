import java.util.*;

class matrix_multiplication{
    int n1,m1,n2,m2;
    int arr1[][]=new int[100][100];
    int arr2[][]=new int[100][100];
    int result[][]=new int[100][100];
    public void multiplication(){
        int i,j,k;
        if(m1!=n2){
            System.out.println("matrix multiplication not possible");
        }
        else{
            for(i=0;i<n1;i++)
            {
                for(j=0;j<m2;j++)
                {
                    int sum=0;
                    for(k=0;k<m2;k++)
                    {
                        sum=sum+(arr1[i][k]*arr2[k][j]);
                    }
                    result[i][j]=sum;
                }
            }
        }
    }
}
class matrix_multiplication_main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        matrix_multiplication mm=new matrix_multiplication();
        System.out.println("Enter the number of rows & columns of 1st matrix: ");
        mm.n1=sc.nextInt();
        mm.m1=sc.nextInt();
        System.out.println("Enter the number of rows & columns of 2nd matrix: ");
        mm.n2=sc.nextInt();
        mm.m2=sc.nextInt();
        int i,j;
        System.out.println("Enter the 1st array elements: ");
        for(i=0;i<mm.n1;i++)
        {
            for(j=0;j<mm.m1;j++)
            {
                mm.arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the 2nd array elements: ");
        for(i=0;i<mm.n2;i++)
        {
            for(j=0;j<mm.m2;j++){
                mm.arr2[i][j]=sc.nextInt();
            }
        }
        mm.multiplication();
        System.out.println("result multiplication of  matrices: ");
        for(i=0;i<mm.n1;i++)
        {
            for(j=0;j<mm.m2;j++)
            {
                System.out.print(mm.result[i][j]+" ");
            }
            System.out.println();
        }
    }
}