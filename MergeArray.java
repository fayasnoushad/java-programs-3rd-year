
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            int len1, len2, len3;
            System.out.print("Enter length of two arrays:- ");
            len1 = scan.nextInt();
            len2 = scan.nextInt();
            len3 = len1 + len2;
            int[] arr1 = new int[len1], arr2 = new int[len2], arr3 = new int[len3];

            System.out.print("Enter array 1 elements: ");
            for (int i = 0; i < len1; i++)
                arr1[i] = scan.nextInt();

            System.out.print("Enter array 2 elements: ");
            for (int i = 0; i < len2; i++)
                arr2[i] = scan.nextInt();

            for (int i = 0; i < len3; i++) {
                arr3[i] = (i < len1) ? arr1[i] : arr2[i - len1];
            }

            System.out.print("\nMerged Array elements:");
            for (int i = 0; i < len3; i++)
                System.out.print(" " + arr3[i]);

            System.out.println();
        }
    }
}
