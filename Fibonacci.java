// Write the java program to display Fibonacci series up to a limit.

import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]) {
        try (Scanner scan = new Scanner(System.in)) {
            int limit, first = 0, second = 1, next;
            System.out.print("Enter a limit for fibonacci series:- ");
            limit = scan.nextInt();
            System.out.print("Fibonacci Series:");
            for (int i = 0; i <= limit; i++) {
                System.out.print("  " + first);
                next = first + second;
                first = second;
                second = next;
            }
            System.out.println();
        }
    }
}