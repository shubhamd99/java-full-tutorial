package ReadingInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Age: ");
        // byte age = scanner.nextByte();
        // System.out.println("You are " + age);

        System.out.print("Name: ");
        // Chaining multiple methods in one row
        String name = scanner.nextLine().trim();
        System.out.println("Your name is " + name);
    }
}
