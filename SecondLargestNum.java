public class SecondLargestNum {
    public static void main(String[] args) {
        int[] arr = {40, 50, 60, 30, 2, 99}; // Input array
        
        // Check if array has at least 2 elements
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // Traverse the array to find max and secondMax
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max; // Update secondMax before updating max
                max = arr[i];    // Update max to current element
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i]; // Update secondMax if element is not max
            }
        }

        // If secondMax hasn't been updated, print that no second largest was found
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second-largest element found.");
        } else {
            System.out.println("The second-largest element is: " + secondMax);
        }
    }
}
