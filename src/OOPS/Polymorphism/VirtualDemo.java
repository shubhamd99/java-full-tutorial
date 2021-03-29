package OOPS.Polymorphism;

public class VirtualDemo {

    public static void main(String[] args) {
        Salary salary = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        // Calling using Employee reference
        Employee employee = new Salary("John Adams", "Boston, MA", 2, 2400.00);

        System.out.println("Call mailCheck using Salary reference --");

        salary.mailCheck();

        System.out.println("\n Call mailCheck using Employee reference--");

        employee.mailCheck();
    }
}
