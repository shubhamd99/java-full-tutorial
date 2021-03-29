package MathClass;

public class Main {
    public static void main(String[] args) {
        int result = Math.round(10.0F);
        System.out.println(result); // 10

        // It returns the smallest (closest to negative infinity) double value that is greater than or equal to the argument and is equal to a mathematical integer.
        int result2 = (int)Math.ceil(9.8F);
        System.out.println(result2); // 10

        // It returns the largest integer less than or equal to a given number.
        int result3 = (int)Math.floor(9.8F);
        System.out.println(result3); // 9

        int result4 = Math.max(1, 2); // Math.min and Math.max
        System.out.println(result4); // 2

        // It returns the largest integer less than or equal to a given number.
        // Floating point number between 0 to 1
        double result5 = Math.random();
        System.out.println(result5); // 0.1976494029999718

        // Between 0 to 100
        // int result6 = (int)Math.round(Math.random() * 100); OR
        int result6 = (int)(Math.random() * 100);
        System.out.println(result6); // 43
    }
}
