
// Write a multi thread java program for displaying odd numbers and even numbers up to a
// limit (Hint : Implement thread using Runnable interface).

import java.util.Scanner;
import java.lang.Runnable;

public class OddEvenThreads {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a limit:- ");
        int limit = scan.nextInt();
        Thread t1 = new Thread(new OddRunnable(limit));
        Thread t2 = new Thread(new EvenRunnable(limit));
        t1.start();
        t2.start();
        scan.close();
        System.out.println("");
    }
}

class OddRunnable implements Runnable {
    int limit;

    public OddRunnable(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        for (int i = 1; i < limit; i += 2) {
            System.out.print(i + " ");
        }
    }
}

class EvenRunnable implements Runnable {
    int limit;

    public EvenRunnable(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        for (int i = 2; i < limit; i += 2) {
            System.out.print(i + " ");
        }
    }
}
