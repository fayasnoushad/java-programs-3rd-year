package P1;

public class Factorial {

    // method to calculate factorial
    public long findFactorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) fact = fact * i;
        
        return fact;
    }
}
