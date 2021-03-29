package ArthmeticExpressions;

public class Main {
    public static void main(String[] args) {
        int result = 10 + 3;
        System.out.println(result);

        double result2 = 10 / 3; // 3.0
        float result3 = 10 / 3F; // 3.3333333
        System.out.println(result2);
        System.out.println(result3);

        double result4 = (double) 10 / (double) 3; // 3.3333333333333335
        System.out.println(result4);

        int x = 0;
        x++;
        int y = x++; // x is assigned to y first then x is incremented by 1 , ++x (it will fix)
        System.out.println(x); // 2
        System.out.println(y); // 1

        x += 2; // Compound assignment operator -=, /=, *=
        System.out.println(x); // 2

        // Order of operations
        // Multi. and Division has higher priority than other, so they will be evaluated first
        int total = 10 + 3 * 2;
        System.out.println(total); // 16

        // () - has higher priority than * /
        int total2 = (10 + 3) * 2;
        System.out.println(total2); // 26
    }
}
