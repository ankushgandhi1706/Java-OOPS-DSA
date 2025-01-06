// Problem Statement:
// Write a Java program to demonstrate the use of variable arguments (varargs).
// The program should accept any number of integer inputs and print them as an array.

// Solution Explanation (in comments):
// This code defines a method 'fun' that accepts a variable number of integers using varargs (int ... v).
// The integers passed to the method are treated as an array internally.
// The program prints the array using Arrays.toString() to show the values in a readable format.

package JavaPractice;

import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {
        // Call the 'fun' method with multiple integer values.
        // The method can handle any number of arguments.
        fun(1, 2, 3, 4, 5, 6);  // Example with 6 integers
        fun(10, 20);            // Example with 2 integers
        fun();                  // Example with no arguments
    }

    // Method to accept variable number of integer arguments
    static void fun(int ... v) {
        // Print the array of integers passed to the method
        System.out.println(Arrays.toString(v));
        // If no arguments are passed, it prints an empty array: []
    }
}
