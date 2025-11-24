// Using class and objects, Write a java program to find the sum of two complex numbers
// (Hint: Use object as parameter to function).
public class AddComplexNums {
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(5, 6);
        System.out.print("Number 1: ");
        c1.show();
        System.out.print("Number 2: ");
        c2.show();
        System.out.print("Sum: ");
        c1.add(c2).show();
    }
}

class Complex {
    int real, img;

    public Complex(int real, int img) {
        this.real = real;
        this.img = img;
    }

    public void show() {
        System.out.println(this.real + " + " + this.img + "i");
    }

    public Complex add(Complex c) {
        Complex cNum = new Complex(this.real + c.real, this.img + c.img);
        return cNum;
    }

}