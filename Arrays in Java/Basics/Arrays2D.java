package JavaPractice;
import java.util.Scanner;
import java.util.Arrays;

public class Arrays2D {
    public static void main(String[] args) {
        // intialisation of a 2D Array :
        int[][] arr = new int[3][3];

        // taking an array input :
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Matrix : ");

        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col] = input.nextInt();
            }

        }

        // Printing the matrix using standard method :
        System.out.println("Printing the Matrix using Standard Method : ");
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

        // printing using Arrays.toString() method :
        System.out.println("Printing the Matrix using Arrays.toString() method : ");
        for(int row=0;row < arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }

        // printing using enhanced for loop :
        System.out.println("Printing the Matrix using enhanced for loop method : ");
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }

        /*
        for variable length column it is hard to take user input, so we write it as :
        int arr[][] = new int[3][];
        arr = {
        {1,2,3},
        {4,5},
        {6,7,8,9}
        }

         */


    }
}
