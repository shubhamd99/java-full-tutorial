package Casting;

public class Main {
    public static void main(String[] args) {
        // Implicit casting (Automatic)
        // byte > short > int > long
        short x = 1;
        int y = x + 2;
        System.out.println(y);

        double x1 = 1.1;
        double y1 = x1 + 2; // 1.1 + 2.0
        System.out.println(y1); // 3.1

        // Explicit Casting
        double x2 = 1.1;
        int y2 = (int)x2 + 2; // 1 + 2
        System.out.println(y2); // 3

        String num = "10";
        int strSum = Integer.parseInt(num) + 30; // parseShort, parseDouble, parseFloat etc.
        System.out.println(strSum); // 40
        System.out.println(Float.parseFloat("40.0")); // 40.0
    }
}
