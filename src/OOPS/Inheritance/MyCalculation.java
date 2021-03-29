package OOPS.Inheritance;

public class MyCalculation extends Calculation {

    public void Multiplication(int a, int b) {
        z = a * b; // z inherited
        System.out.println("The product of the given numbers: " + z);
    }

    public static void main(String[] args) {
        int a = 20, b = 10;
        MyCalculation myCalculation = new MyCalculation();
        myCalculation.addition(a, b); // addition inherited
        myCalculation.Subtraction(a, b); // subtraction inherited
        myCalculation.Multiplication(a, b);
    }
}
