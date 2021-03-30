package Loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // For Loops
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World " + i);
        }
        // Reverse For Loop
        for (int i = 5; i > 0; i--) {
            System.out.println("Hello World " + i);
        }

        // For-Each Loop
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println("Car: " + i);
        }

        // While Loop
        // The while loop loops through a block of code as long as a specified condition is true.
        int j = 5;
        while (j > 0) {
            System.out.println("Hello World While loop " + j);
            j--;
        }

        String input = "";
        Scanner scanner = new Scanner(System.in);

        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }

        // Do While Loop
        // The do/while loop is a variant of the while loop.
        // This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.
        do {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));

        // Break and Continue
        while (true) { // Forever
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();

            if (input.equals("pass")) {
                continue;
            }

            if (input.equals("quit")) {
               break;
            }
            System.out.println(input);
        }
    }
}
