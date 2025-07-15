//Check if a number is palindrome.
public class Palindrome {
    public static int reverseNumber(int num, int rev) {
        if (num == 0) {
            return rev;
        }
        return reverseNumber(num / 10, rev * 10 + (num % 10));
    }

    public static boolean isPalindrome(int num) {
        if (num < 0) return false; 
        int reversed = reverseNumber(num, 0);
        return num == reversed;
    }

    public static void main(String[] args) {
        int number = 12321; 

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
