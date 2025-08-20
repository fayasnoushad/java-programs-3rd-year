// Armstrong numbers within a limit

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int limit;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a limit: ");
            limit = sc.nextInt();
            for (int i = 1; i <= limit; i++) {
                if (isArmstrong(i)) {
                    System.out.println(i);
                }
            }
        }
    }

    static boolean isArmstrong(int num) {
        int temp, count, sum, rem;
        temp = num;
        count = 0;
        while (temp != 0) {
            temp /= 10;
            count += 1;
        }
        temp = num;
        sum = 0;
        while (temp != 0) {
            rem = temp % 10;
            temp /= 10;
            sum += Math.pow(rem, count);
        }

        return (sum == num);
    }
}
