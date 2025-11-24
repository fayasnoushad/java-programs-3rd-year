// Write a java program to find the volume of cube, rectangular box, cylinder
// using function overloading

import java.util.Scanner;

class Vol {
    // volume of cube
    void findVolume(double a) {
        System.out.println("Volume of cube = " + (a * a * a));
    }

    // volume of rectangular box
    void findVolume(double a, double b, double c) {
        System.out.println("Volume of rectangular box = " + (a * b * c));
    }

    // volume of cylinder
    void findVolume(double a, double b) {
        System.out.println("Volume of cylinder = " + (3.14 * a * a * b));
    }
}

public class Volume {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // Scanner class object to read input values
        Scanner s = new Scanner(System.in);

        // object of Volume class to call methods
        Vol obj = new Vol();
        // call findVolume() with parameters

        // cube volume
        System.out.print("Enter the side of cube:- ");
        obj.findVolume(s.nextDouble());

        // rectangular box volume
        System.out.print("\nEnter the length, width and height of the rectangular box:- ");
        obj.findVolume(s.nextDouble(), s.nextDouble(), s.nextDouble());

        // cylinder volume
        System.out.print("\nEnter the radius and height of the cylinder:- ");
        obj.findVolume(s.nextDouble(), s.nextDouble());

        s.close();
    }
}