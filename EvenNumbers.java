//Print even numbers from 2 to N.
public class EvenNumbers {
    public static void printEven(int i, int n) {
        if (i > n) return;            
        System.out.print(i + " ");
        printEven(i + 2, n);        
    }

    public static void main(String[] args) {
        int n = 20;
        printEven(2, n);              
}
}
