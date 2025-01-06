package JavaPractice;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2D {
    public static void main(String[] args) {
        // Declaring the Arraylist :
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Intialising the ArrayList as a matrix of three rows :
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }

        // Inserting Elements :
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the elements in Arraylist : ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(input.nextInt());
            }
        }
        /*
        This nested loop is used to insert elements into the 2D ArrayList.
        The outer loop runs three times (for the three rows),
        and the inner loop also runs three times (for the three columns in each row).

        list.get(i) accesses the i-th row of the outer ArrayList list.
        list.get(i).add(input.nextInt()) adds an element to the i-th row (which is an inner ArrayList).
        So, "list.get(i)" is necessary to specify which row (i.e., which inner ArrayList) you want to add the new element to.
        Without using list.get(i), you wouldn't be able to access the specific row to insert elements into it.
         */

        // printing the list
        System.out.println(list);

    }

}
