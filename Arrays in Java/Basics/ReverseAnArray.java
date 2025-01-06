package JavaPractice;
import java.util.Scanner;
import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = new int[10];  // Initializing the array
        Scanner sc = new Scanner(System.in); // Initializing input statement

        System.out.print("Enter the elements in array : ");
        // Loop to take input for an array
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(); // print statement to add newline
        System.out.println("The input array is : "+ Arrays.toString(arr)); /* print the Array using
                                                                              Arrays.toSting() method */

        System.out.print("The reverse of input Array is : "); //Printing reverse of an Array
        // LOOP  to reverse an array
        for(int i=arr.length-1;i>-1;i--){
            System.out.print(arr[i]+" ");
        }

    }
}
