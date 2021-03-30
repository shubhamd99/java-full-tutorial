package Operators;

public class Main {
    public static void main(String[] args) {
        // Comparison Operators (==, !=, >, <, >=, <=)
        int x = 1;
        int y = 1;
        boolean result = x == y;
        boolean result2 = x != y;
        System.out.println(result); // true
        System.out.println(result2); // false

        // Logical Operators
        // Java will evaluate this condition from left to right
        int temp = 12;
        boolean isWarm = temp > 20 && temp < 30;
        System.out.println(isWarm); // false

        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean isEligible = hasHighIncome || hasGoodCredit;
        System.out.println(isEligible); // true

        boolean hasCriminalRecord = false;
        System.out.println((hasHighIncome || hasGoodCredit) && !hasCriminalRecord); // true

        // Ternary Operators
        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy";

    }
}
