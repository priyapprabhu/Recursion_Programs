//Find the sum of digits of a number.
import java.util.Scanner;

public class SumOfDigits {
    static int digitSum(int n) {
        if (n < 0) {
            n = -n;
        }
        if (n < 10) {
            return n;
        }
        return (n % 10) + digitSum(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int result = digitSum(number);
        System.out.println("Sum of digits = " + result);
    }
}

