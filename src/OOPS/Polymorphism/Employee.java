package OOPS.Polymorphism;

public class Employee {
    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number) {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    // Method
    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }

    // The toString() method returns the string representation of the object.
    public String toString() {
        return name + " " + address + " " + number;
    }

    // Getters
    public String getName() {
        return name;
    }

    // Getters
    public String getAddress() {
        return address;
    }

    // Setters
    public void setAddress(String newAddress) {
        address = newAddress;
    }

    // Getters
    public int getNumber() {
        return number;
    }
}
