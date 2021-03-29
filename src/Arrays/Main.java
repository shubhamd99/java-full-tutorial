package Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Arrays have fixed length

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;

        Arrays.sort(numbers);

        // numbers[10] = 5; // Exception
        System.out.println(Arrays.toString(numbers)); // [1, 2, 0, 0, 0]
        System.out.println(numbers.length); // 5

        int[] numers2 = {1,2,3,4};
        System.out.println(Arrays.toString(numers2));

        // Multi-Dimensional Arrays
        int[][] twoDim = new int[2][3];
        twoDim[0][0] = 1;
        System.out.println(Arrays.deepToString(twoDim));

        int[][] twoDim2 = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(Arrays.deepToString(twoDim2));
    }
}
