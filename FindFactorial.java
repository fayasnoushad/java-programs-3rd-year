import P1.Factorial;
import java.util.Scanner;

class FindFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Factorial obj = new Factorial();
        long result = obj.findFactorial(num);

        System.out.println("Factorial of " + num + " = " + result);

        sc.close();
    }
}
