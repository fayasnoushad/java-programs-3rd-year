
import java.util.Scanner;

public class TraceAndTranspose {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n;
            System.out.print("Enter no of rows and cols (nxn): ");
            n = scan.nextInt();
            int[][] matrix = new int[n][n], transpose = new int[n][n];

            System.out.println("Enter matrix elements: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = scan.nextInt();
                }
            }

            int trance = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j)
                        trance += matrix[i][j];
                    transpose[i][j] = matrix[j][i];
                }
            }

            System.out.println("\nTrance of the matrix: " + trance);
            System.out.println("Transpose of matrix:");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(" " + transpose[i][j]);
                }
                System.out.println();
            }
        }
    }
}
