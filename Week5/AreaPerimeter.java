import java.util.*;

class AreaPerimeter{
    int radius;
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double circleArea(){
        return radius*3.14*radius;
    }
    public double circlePerimeter(){
        return 2*3.14*radius;
    }
}
class AreaPerimeter_Main{
    public static void main(String[] args) {
        AreaPerimeter ap=new AreaPerimeter();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of circle: ");
        ap.radius=sc.nextInt();
        System.out.println("area: "+ap.circleArea());
        System.out.println("perimeter: "+ap.circlePerimeter());
        
    }
}