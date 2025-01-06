package JavaPractice;
import java.util.Scanner;
import java.util.ArrayList;

public class ReverseAnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements in ArrayList : ");
        for(int i=0;i<10;i++){
            list.add(sc.nextInt());
        }

        System.out.println();
        System.out.println("The input ArrayListrray is : "+list);


        System.out.print("The reverse of input Array is : ");
        for(int i=list.size()-1;i>-1;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
