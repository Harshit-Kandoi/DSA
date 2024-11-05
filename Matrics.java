import java.util.*;

public class Matrics {

    public static boolean search(int matrix[][], int key) {
        // Iterate through each element in the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    // Key found at position (i, j)
                    System.out.println("Found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        // Key not found in the matrix
        System.out.println("Key not found");
        return false;
    }

    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = 0;  // Start from the first row
        int col = matrix[0].length - 1;  // Start from the last column (top-right corner)

        // Traverse the matrix until the row and column indices are within bounds
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                // Key found at position (row, col)
                System.out.println("Found key at (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                // If the key is smaller than the current element, move left
                col--;
            } else {
                // If the key is larger than the current element, move down
                row++;
            }
        }

        // Key not found in the matrix
        System.out.println("Key not found!");
        return false;
    }

    public static void main(String[] args) {
        // Define a sorted matrix for staircase search
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        int key = 33;  // Define the key to search for

        // Perform staircase search for the key
        staircaseSearch(matrix, key);            

        // Uncomment the code below for manual matrix input and brute-force search
        /*
        int matrix[][] = new int[3][3];  // Define a 3x3 matrix
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        
        // Input the matrix elements from the user
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output the matrix elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();  // Move to the next line after each row
        }

        // Perform brute-force search for a key (for example, 5)
        search(matrix, 5);
        */
    }
}
