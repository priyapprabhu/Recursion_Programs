//Count the number of digits of a number.
import java.util.Scanner;

public class CountDigits {
    static int countDigits(int n) {
        if (n < 0) n = -n;
        if (n < 10) return 1;

        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int digits = countDigits(number);
        System.out.println("Number of digits = " + digits);
    }
}

