//Find the nth fibonacci number
import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;                  // base cases
        }
        return fibonacci(n - 1) + fibonacci(n - 2);  // recursive step
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n to get the nth Fibonacci number: ");
        int n = sc.nextInt();

        int nthFib = fibonacci(n);
        System.out.println("F(" + n + ") = " + nthFib);

    }
}
