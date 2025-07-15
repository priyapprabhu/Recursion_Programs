//Calculate product of first n natural numbers.
public class Product {
    public static int ProductOfNaturalNumbers(int n) {
        // Base case
        if (n == 1) {
            return 1;
        }
        // Recursive case
        return n * ProductOfNaturalNumbers(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Product of first " + n + " natural numbers is: " + ProductOfNaturalNumbers(n));
    }
}

