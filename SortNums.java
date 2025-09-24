
// Write a program to sort a set of n numbers using a class.
import java.util.Scanner;

public class SortNums {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n;
            Nums nums;
            System.out.print("Enter length of array:- ");
            n = scan.nextInt();
            nums = new Nums(n);

            System.out.print("Enter array elements: ");
            for (int i = 0; i < n; i++)
                nums.addNum(scan.nextInt());

            System.out.print("\nArray before sorting:");
            nums.printNums();

            nums.sortNums();

            System.out.print("Array after sorting:");
            nums.printNums();
        }
    }
}

class Nums {
    int[] nums;
    int index = 0;

    Nums(int length) {
        nums = new int[length];
    }

    void addNum(int num) {
        nums[index++] = num;
    }

    void printNums() {
        for (int i = 0; i < index; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
    }

    void sortNums() {
        int minIndex, temp;
        for (int i = 0; i < index; i++) {
            minIndex = i;
            for (int j = i + 1; j < index; j++) {
                if (nums[j] < nums[minIndex])
                    minIndex = j;
            }
            if (i != minIndex) {
                temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }
    }

}