package IfStatements;

public class Main {
    public static void main(String[] args) {
        int temp = 32;
        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink Water");
        } else if (temp > 20 && temp <= 30) {
            System.out.println("beautiful day");
        } else {
            System.out.println("Cold day");
        }

        // Simplifying If statement
        int income = 120_000;
        boolean hasHighIncome = false;

        if (income > 100_000) {
            hasHighIncome = true;
        }

        boolean hasHighIncome2 = (income > 100_000);

        System.out.println(hasHighIncome);
        System.out.println(hasHighIncome2);
    }
}
