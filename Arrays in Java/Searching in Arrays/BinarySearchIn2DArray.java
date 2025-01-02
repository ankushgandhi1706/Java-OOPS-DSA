package JavaPractice;

import java.util.Arrays;

public class BinarySearchIn2DArray {
    public static void main(String[] args) {
        // Define a 2D array (matrix) with sorted rows and columns
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        // Search for the target value 11 and print its index
        System.out.println("The index of target element is : " + Arrays.toString(search(arr, 11)));
    }

    // Perform binary search in a specific row of the 2D array
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;

            if (matrix[row][mid] == target) {
                return new int[]{row, mid}; // Return the index if target is found
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1; // Search in the right half
            } else {
                cEnd = mid - 1; // Search in the left half
            }
        }
        return new int[]{-1, -1}; // Return -1, -1 if target is not found
    }

    // Search for the target value in the 2D array
    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // Be cautious, matrix may be empty

        // If there's only one row, perform a binary search on that row
        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // Narrow down to two rows
        while (rStart < (rEnd - 1)) { // Loop until more than two rows remain
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid}; // Return the index if target is found
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid + 1; // Move to the bottom half
            } else {
                rEnd = mid - 1; // Move to the top half
            }
        }

        // Now only two rows remain, rStart and rStart + 1
        // Check if the target is in the middle column of these rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid}; // Return the index if target is found
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid}; // Return the index if target is found
        }

        // Search in the 1st quadrant
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }

        // Search in the 2nd quadrant
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }

        // Search in the 3rd quadrant
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }

        // Search in the 4th quadrant
        else {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
}