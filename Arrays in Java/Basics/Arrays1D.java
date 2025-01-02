package JavaPractice;
import java.util.Arrays; // To use methods and functions in array class like Arrays.toSting() method;
import java.util.Scanner;
public class Arrays1D {
    public static void main(String[] args) {
        /*
       // declaration of Array :
        int[] arr;
        // initialisation of array
        arr = new int[5];

         */

        // Standard way to initialise an array
        int[] arr = new int[5];

        // Take an Array input :
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Array : ");
        for(int i=0;i< arr.length;i++){
            arr[i] = input.nextInt();
        }

        /*
        // Enhanced for loop to take an array input :
        for(int i: arr){
            arr[i] = input.nextInt();
        }

         */

        // Print an Array :
        System.out.println("Printing an Array : ");

        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        // Printing using enhanced for loop :
        System.out.println("Printing Array using enhanced for loop : ");
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();

        // printing using Arrays.toString() method :
        System.out.println("Printing Array using Arrays.toString() method : ");
        System.out.println(Arrays.toString(arr));
    }
}
