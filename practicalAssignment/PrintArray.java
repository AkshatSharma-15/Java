public class PrintArray {

    public static void printArray(int[] arr) {
        // Loop through the array and print each element
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            // Print comma and space if it's not the last element
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        // Print a new line after printing the array
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        System.out.print("Array: ");
        printArray(numbers);
    }
}
