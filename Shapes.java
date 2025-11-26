// Base class
abstract class Shape {
    abstract void area();
}

// Subclass for 2D shapes
abstract class TwoDim extends Shape {}

// Subclass for 3D shapes
abstract class ThreeDim extends Shape {}

// Square class
class Square extends TwoDim {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    void area() {
        System.out.println("Area of Square = " + (side * side));
    }
}

// Triangle class
class Triangle extends TwoDim {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void area() {
        System.out.println("Area of Triangle = " + (0.5 * base * height));
    }
}

// Sphere class
class Sphere extends ThreeDim {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        System.out.println("Surface Area of Sphere = " + (4 * Math.PI * radius * radius));
    }
}

// Cube class
class Cube extends ThreeDim {
    double side;

    Cube(double side) {
        this.side = side;
    }

    @Override
    void area() {
        System.out.println("Surface Area of Cube = " + (6 * side * side));
    }
}

// Main class to test
public class Shapes {
    public static void main(String[] args) {

        Shape s;

        s = new Square(5);
        s.area();

        s = new Triangle(4, 6);
        s.area();

        s = new Sphere(3);
        s.area();

        s = new Cube(4);
        s.area();
    }
}
