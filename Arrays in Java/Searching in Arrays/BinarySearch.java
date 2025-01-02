package JavaPractice;
import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
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
        int ans = binarySearch(arr,target);
        System.out.println("The index of the entered Element is : " + ans);
    }

    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            // find the middle element
            // int mid = (start + end) / 2;  -> might possible (start + end) exceeds the range of int

            int mid = start + (end-start)/2;

            // Code to search in array :
            // if target == middle element
            if(target == arr[mid]){
                return mid;
            }

            // If Array is sorted in Ascending order :
            if(arr[start] <= arr[end]){
                // if target element is smaller than the middle element
                if (target < arr[mid]) {
                    end = mid-1;
                }
                // if target element is greater than the middle element
                else{
                    start = mid+1;
                }
            }

            // If Array is sorted in descending order :
            else if (arr[start] > arr[end]) {

                // if target element is greater than the middle element
                if(target > arr[mid]){
                    end = mid-1;
                }

                // if target element is smaller than the middle element
                else{
                    start = mid+1;
                }

            }


        }
        return -1;
    }
}
