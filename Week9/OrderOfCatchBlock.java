import java.util.*;

public class OrderOfCatchBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        int arr[] = new int[] { 1, 2, 3 };
        try {
            a = 10;
            b = 2;
            c = a / b;
            c = arr[1] / arr[4];
            System.out.println(c);
        } catch (ArithmeticException ar) {
            System.out.println(ar);
        }
        catch(ArrayIndexOutOfBoundsException l)
        {
            System.out.println(l);
        } 
        catch (Exception e) {
            System.out.println("super class Exception: " + e);
        }
        // catch (ArithmeticException a) {
        // // Unreachable catch block for ArithmeticException. It is already handled by
        // the
        // // catch block for Exception
        // }
        //catch (ArrayIndexOutOfBoundsException p) {
            // Unreachable catch block for ArrayIndexOutOfBoundsException. It is already
            // handled by the catch block for Exception
        //}
    }
}
