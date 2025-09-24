
// Write java program to find the sum of the digits and reverse of a given number using class and objects.
import java.util.Scanner;

public class SumAndRev {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a number:- ");
            int num = scan.nextInt();
            SumRev sumRevObj = new SumRev();
            sumRevObj.setNum(num);
            sumRevObj.reverseAndSum();
        }
    }
}

class SumRev {
    int num;

    void setNum(int num) {
        this.num = num;
    }

    void reverseAndSum() {
        int sum = 0, rev = 0, rem;
        while (num != 0) {
            rem = num % 10;
            num /= 10;
            sum += rem;
            rev = (rev * 10) + rem;
        }
        System.out.println("Sum of digits: " + sum);
        System.out.println("Reverse of number: " + rev);
    }
}
