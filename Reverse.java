//Print a number in reverse.
import java.util.Scanner;
public class Reverse {
    static void printReverse(int n) {
        System.out.print(n % 10);

        if (n / 10 != 0) {
            printReverse(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.print("Reversed number: ");
        printReverse(number);

    }
}
