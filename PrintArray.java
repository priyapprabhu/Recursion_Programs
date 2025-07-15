//Print all elements of an array using recursion 
public class PrintArray {
    public static void printArray(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        System.out.print(arr[index] + " ");
        printArray(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Array elements: ");
        printArray(arr, 0); 
    }
}
