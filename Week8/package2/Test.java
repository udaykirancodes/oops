import shapes.Square;

import java.util.Scanner;

import shapes.Circle;
import shapes.Triangle;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Square s=new Square();
        Circle c=new Circle();
        Triangle t=new Triangle();
        System.out.println("enter the side of square: ");
        int l=sc.nextInt();
        System.out.println("enter the hight of a triangle: ");
        int h=sc.nextInt();
        System.out.println("enter the radius of circle: ");
        int r=sc.nextInt();
        System.out.println("\nSQUARE:-");
        s.area(l);
        s.perimeter(l);
        System.out.println("\nCIRCLE:- ");
        c.area(r);
        c.perimeter(r);
        System.out.println("\nTRIANGLE: ");
        t.area(l, h);
        t.perimeter(l);
    }
    
}
