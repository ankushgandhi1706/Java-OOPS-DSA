/*

## Problem Statement:
   Write a Java program that accepts an array of integers from the user, prints the array,
   and allows the user to swap two elements at specified indices. The program should then
   display the array after swapping the elements.

## Solution Explanation (in comments):
   This program initializes an array of size 5, takes input from the user to populate the array,
   and then asks the user to specify two indices to swap their corresponding elements.
   A function 'Swapindex' is used to perform the swapping operation and print the updated array.

*/


package JavaPractice;

import java.util.Scanner; // Import Scanner for user input

public class SwapIndexArray {
    public static void main(String[] args) {
        // Step 1: Initialize an array of size 5
        int[] arr = new int[5];

        // Step 2: Take array input from the user
        Scanner input = new Scanner(System.in);  // Create Scanner object for input

        System.out.println("Enter the Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();  // Read each element of the array
        }

        // Step 3: Print the original array
        System.out.println("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  // Print elements in the same line
        }
        System.out.println();  // Move to next line after printing array

        // Step 4: Ask user for indices to swap
        System.out.println("Enter the indexs of elements you want to swap : ");
        int i1 = input.nextInt();  // Read first index
        int i2 = input.nextInt();  // Read second index
        System.out.println("Indices to swap: " + i1 + " " + i2);

        // Step 5: Perform the swap and print the updated array
        System.out.println("Array after swapping: ");
        Swapindex(i1, i2, arr);  // Call the swap function with indices and array
    }

    // Function to swap elements at specified indices
    static void Swapindex(int index1, int index2, int[] array) {
        // Step 6: Swap elements using a temporary variable
        int temp;
        temp = array[index1];  // Store element at index1 in temp
        array[index1] = array[index2];  // Assign element at index2 to index1
        array[index2] = temp;  // Assign temp to index2 (swap complete)

        // Step 7: Print the updated array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();  // Move to the next line after printing

        return;  // Return to the calling method
    }
}
