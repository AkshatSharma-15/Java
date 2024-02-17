public class ElementIndex {
    
    public static int findElementIndex(int[] arr, int target) {
        // Loop through the array to find the index of the target element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if the target element is found
            }
        }
        // If the target element is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        int target = 15;
        
        int index = findElementIndex(numbers, target);
        
        if (index != -1) {
            System.out.println("Index of element " + target + " is: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
