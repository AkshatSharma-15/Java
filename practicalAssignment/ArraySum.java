public class ArraySum {
    
    public static int calculateSum(int[] arr) {
        int sum = 0;
        // Loop through the array and add each element to the sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        int sum = calculateSum(numbers);
        System.out.println("Sum of all elements in the array: " + sum);
    }
}
