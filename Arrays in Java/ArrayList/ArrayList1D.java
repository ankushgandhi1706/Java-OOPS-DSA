package JavaPractice;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1D {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // Initializing the ArrayList
        Scanner in = new Scanner(System.in); // Initializing input statement

        System.out.print("Enter the elements in ArrayList : ");
        // For loop to take an Array Input
        for(int i=0;i<10;i++){
            list.add(in.nextInt());
        }

        System.out.println();
        System.out.println(list); // printing the elements in ArrayList

        // Getting the element at a specific index
        System.out.print("Fifth element in the ArrayList is : " + list.get(4));

    }
}
