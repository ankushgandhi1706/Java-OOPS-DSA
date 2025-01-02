package JavaPractice;
import java.util.Scanner;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        // Initialising Scanner to take inputs
        Scanner input = new Scanner(System.in);
        // Initialising the Array
        int[] arr = new int[10];

        // Taking the Array input
        System.out.print("Enter the Array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        System.out.println();  // println statement to move to the next line

        //printing the array
        System.out.println("The Entered Array is : " + Arrays.toString(arr));

        // Taking the input for target element
        System.out.print("Enter the target Element : ");
        int target = input.nextInt();
        System.out.println(); // println statement to move to the next line

        // Returning the index of target element if found
        int ans = linearSearch(arr,target);
        System.out.println("The index of the entered Element is : " + ans);

    }

    // Function to search in the array : return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr,int target){
        // Checking if the Array is initially empty
        if(arr.length == 0){
            return -1;
        }

        // Run a for loop to search for the element
        for(int index=0;index<arr.length;index++){
            int element = arr[index];
            if(element == target){
                return index;
            }

        }
        return -1;
    }
}
