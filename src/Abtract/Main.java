package Abtract;
abstract class shape{
    abstract double area();
    abstract double perimeter();
}
class circle extends shape{
    double radius;
    public double area(){
        return 2*Math.PI*radius;
    }
    public double perimeter(){
        return Math.PI*radius*radius;
    }
}
class rectangle extends shape{
    double length;
    double breadth;
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
}

public class Main {
    public static void main(String[] args) {
        circle r= new circle();
        r.radius = 10;
        shape s= r;
        System.out.println("Area of the circle "+s.area());
        System.out.println("perimeter of the circle "+s.perimeter());

        rectangle s1 = new rectangle();
        s1.length = 10;
        s1.breadth = 5;
        System.out.println("\nArea of the rectangle "+s1.area());
        System.out.println("Area of the rectangle "+s1.perimeter());
    }
}
