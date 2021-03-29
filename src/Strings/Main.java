package Strings;

public class Main {
    public static void main(String[] args) {
        // Strings are immutable

        String message = "Hello World " + "!!";
        System.out.println(message);

        System.out.println(message.endsWith("!!")); // true
        System.out.println(message.startsWith("!!")); // false

        System.out.println(message.indexOf("t")); // -1
        System.out.println(message.replace("!!", "**")); // Hello World **

        System.out.println(message); // Strings are immutable

        System.out.println(message.toUpperCase()); // HELLO WORLD !!

        System.out.println(" Hi ".trim()); // Remove extra spaces

        // Escape Sequences

        String msg = "Hello \"Shubham\"";
        System.out.println(msg); // Hello "Shubham"

        String dir = "c:\\Windows\\...";
        System.out.println(dir); // c:\Windows\...

        String newLine = "Hello\nWorld";
        System.out.println(newLine);

        String newTab = "Hello\tWorld";
        System.out.println(newTab); // Hello	World
    }
}
