package OOPS.Abstraction;

public class AbstractDemo {
    public static void main(String[] args) {
        /* Following is not allowed and would raise error */
        // EmployeeAbstract e = new EmployeeAbstract("George W.", "Houston, TX", 43); // Error

        EmployeeSalary s = new EmployeeSalary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        EmployeeSalary e = new EmployeeSalary("John Adams", "Boston, MA", 2, 2400.00);
        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();
        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
    }
}
