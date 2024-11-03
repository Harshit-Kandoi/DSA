import java.util.*;

public class arrays {
    
    // Increment each element in the array by 1
    public static void update(int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    // Perform linear search to find the key in the array
    public static int linearSearch(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i; // Key found
            }
        }
        return -1; // Key not found
    }

    // Find the largest and smallest values in the array
    public static int getLargest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return largest;
    }

    // Perform binary search on a sorted array to find the key
    public static int binarySearch(int[] numbers, int key) {
        int start = 0, end = numbers.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (numbers[mid] == key) { 
                return mid; // Key found
            }
            if (numbers[mid] < key) { 
                start = mid + 1; // Search right half
            } else {
                end = mid - 1; // Search left half
            }
        }
        return -1; // Key not found
    }

    // Reverse the elements in the array
    public static void reverse(int[] numbers) {
        int first = 0, last = numbers.length - 1;

        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    // Print all possible pairs of elements in the array
    public static void printPairs(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
            }
            System.out.println();
        }
    }

    // Print all subarrays and the count of total subarrays
    public static void printSubarrays(int[] numbers) {
        int totalSubarrays = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                }
                totalSubarrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays = " + totalSubarrays);
    }

    // Calculate the maximum subarray sum using brute-force approach
    public static void maxSubarraySum(int[] numbers) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int currSum = 0;
            for (int j = i; j < numbers.length; j++) {
                currSum += numbers[j];
                System.out.println("Subarray sum: " + currSum);
                maxSum = Math.max(maxSum, currSum);
            }
        }
        System.out.println("Maximum subarray sum = " + maxSum);
    }

    // Calculate maximum subarray sum using prefix sum technique
    public static void maxSubarrayPrefixSum(int[] numbers) {
        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[numbers.length];

        // Calculate prefix sum array
        prefix[0] = numbers[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                maxSum = Math.max(maxSum, currSum);
            }
        }
        System.out.println("Maximum subarray sum (Prefix Sum) = " + maxSum);
    }

    // Find maximum subarray sum using Kadane's algorithm
    public static void kadanes(int[] numbers) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            currSum += numbers[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("Maximum subarray sum (Kadane's) = " + maxSum);
    }

    public static void main(String[] args) {
        // Test array for various methods
        int[] numbers = {-1, 2, -3, 5, 7};

        // Uncomment to test individual methods
        // update(numbers);
        // System.out.println(Arrays.toString(numbers));

        // System.out.println("Linear Search Result: " + linearSearch(numbers, 7));
        // System.out.println("Largest Value: " + getLargest(numbers));
        // System.out.println("Binary Search Result: " + binarySearch(numbers, 7));

        // reverse(numbers);
        // System.out.println("Reversed Array: " + Arrays.toString(numbers));

        // printPairs(numbers);
        // printSubarrays(numbers);
        // maxSubarraySum(numbers);
        // maxSubarrayPrefixSum(numbers);
        kadanes(numbers);
    }
}
