import java.lang.*;
import java.util.*;

class quadratic_roots {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, c, d;
		double r1, r2;
		System.out.print("Enter the values of a, b and c : ");
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = ((b * b) - 4 * a * c);
		if (d > 0) {
			r1 = ((-b + Math.sqrt(d)) / (2 * a));
			r2 = ((-b - Math.sqrt(d)) / (2 * a));
			System.out.print("Roots are real and they are: " + r1 + " and " + r2);
		} else if (d < 0) {
			r1 = ((-b) / (2 * a)); // real part
			r2 = ((Math.sqrt(-d)) / (2 * a)); // imaginary part
			System.out.printf("Roots are imaginary and they are: %.2f+i%.2f and %.2f-i%.2f ", r1, r2, r1, r2);
		} else {
			r1 = -b / 2 * a;
			System.out.println("Roots are real and equal : " + r1 + " and " + r1);
		}
	}
}