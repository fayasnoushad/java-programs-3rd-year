
import java.util.Scanner;

// abstract class
abstract class Shape {
    double dim1, dim2;

    Shape(double a, double b) {
        this.dim1 = a;
        this.dim2 = b;
    }

    // abstract method
    abstract double area();
}

// rectangle class
class Rectangle extends Shape {
    Rectangle(double length, double breadth) {
        super(length, breadth);
    }

    @Override
    double area() {
        return dim1 * dim2;
    }
}

// triangle class
class Triangle extends Shape {
    Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    double area() {
        return 0.5 * dim1 * dim2;
    }
}

// main class
public class AbstractClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // rectangle
        System.out.print("Enter length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        Shape rect = new Rectangle(l, b);
        System.out.println("Area of Rectangle: " + rect.area());

        // triangle
        System.out.print("\nEnter base and height of triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        Shape tri = new Triangle(base, height);
        System.out.println("Area of Triangle: " + tri.area());
    }
}
