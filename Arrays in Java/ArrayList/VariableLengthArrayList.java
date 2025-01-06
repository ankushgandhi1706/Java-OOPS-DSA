package JavaPractice;
import java.util.ArrayList;
import java.util.Scanner;

public class VariableLengthArrayList {
    public static void main(String[] args) {
        // Create a Scanner object for getting input from the user
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store the input integers
        ArrayList<Integer> integers = new ArrayList<>();

        // Loop to get user input
        while (true) {
            // Prompt the user to enter integers or 'exit' to finish
            System.out.print("Enter integers separated by space (or type 'exit' to finish): ");
            String input = scanner.nextLine();

            // Split the input by spaces to handle multiple inputs in one line
            String[] inputs = input.split(" ");
            boolean exit = false;

            for (String value : inputs) {
                if (value.equalsIgnoreCase("exit")) {
                    exit = true;
                    break;
                } else {
                    try {
                        // Convert the input to an integer and add it to the ArrayList
                        int number = Integer.parseInt(value);
                        integers.add(number);
                    } catch (NumberFormatException e) {
                        // Handle the case where the input is not a valid integer
                        System.out.println("Invalid input: " + value + ". Please enter a valid integer.");
                    }
                }
            }

            if (exit) {
                break;
            }
        }

        // Close the scanner
        scanner.close();

        // Display the integers entered by the user
        System.out.println("You entered the following integers:");
        for (int number : integers) {
            System.out.print(number + " ");
        }
    }
}
