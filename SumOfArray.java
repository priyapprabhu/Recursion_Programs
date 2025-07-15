//Print sum of an array using Recursion .
public class SumOfArray {
    public static int sumArray(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + sumArray(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        int sum = sumArray(arr, 0); 
        System.out.println("Sum of array elements: " + sum);
    }
}
