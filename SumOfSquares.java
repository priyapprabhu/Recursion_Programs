//Calculate sum of squares of 1st N natural numbers.
public class SumOfSquares {
    public static int sumOfSquares(int n) {
        if (n == 1) {
            return 1;
        }
        return n * n + sumOfSquares(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;  

        int result = sumOfSquares(n);
        System.out.println("Sum of squares of first " + n + " natural numbers is: " + result);
    }
}
