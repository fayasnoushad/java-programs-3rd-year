
import java.util.Scanner;

public class BaseConversion {
    public static void main(String args[]) {
        Convert c = new Convert();
        c.getVal();
        c.convert();
    }
}

class Convert {
    Scanner scan = new Scanner(System.in);
    int num;

    void getVal() {
        System.out.print("Enter a number to convert :- ");
        num = scan.nextInt();
    }

    void convert() {
        System.out.println("Binary: " + Integer.toBinaryString(num));
        System.out.println("Octal: " + Integer.toOctalString(num));
        System.out.println("Hexadecimal: " + Integer.toHexString(num));
    }
}