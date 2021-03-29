package Types;

import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Primitive Types
        byte age = 30;
        int viewsCount = 123_456_789; // 123,456,789
        long viewCountHuge = 3_123_456_789L; // We can use l or L
        float price = 10.99F;
        double largePrice = 10000000.9999999; // We can use f or F
        char letter = 'A';
        boolean isEligible = false; // true or false

        // Reference Types
        Date now = new Date();
        System.out.println(now.getTime());

        // Primitive Types vs Reference Types
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y); // 1

        Point point1 = new Point(1,2);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

    }
}
