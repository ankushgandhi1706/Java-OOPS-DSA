package JavaPractice;
import java.util.Scanner;
import java.util.Arrays;

public class LinearSearchIn2DArray {
    public static void main(String[] args) {
        // Initialising Scanner to take inputs
        Scanner input = new Scanner(System.in);
        // Initialising the Array
        int[][] arr = new int[3][3];

        // Taking the Array input
        System.out.print("Enter the Array : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println();  // println statement to move to the next line

        //printing the array
        System.out.println("The Entered Array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        // Taking the input for target element
        System.out.print("Enter the target Element : ");
        int target = input.nextInt();
        System.out.println(); // println statement to move to the next line

        // Returning the index of target element if found
        int[] ans = linearSearch(arr,target);
        System.out.println("The index of the entered Element is : " + Arrays.toString(ans));
    }

    // Function to search in the array : return the {row,col} if item found
    // otherwise if item not found return {-1,-1}
    static int[] linearSearch(int[][] arr,int target){
        // Checking if the Array is initially empty
        if(arr.length == 0){
            return new int[]{-1,-1};
        }

        // Run a for loop to search for the element
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }

        }
        return new int[]{-1,-1};

    }
}
