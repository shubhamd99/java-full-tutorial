package OOPS.Abstraction;

// Anstract Class
public abstract class EmployeeAbstract {
    private String name;
    private String address;
    private int number;

    public EmployeeAbstract(String name, String address, int number) {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    // Abstract Method
    // If you want a class to contain a particular method but you want the actual implementation of that method to be determined by child classes,
    // you can declare the method in the parent class as an abstract.
    public abstract double computePay();

    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }

    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public int getNumber() {
        return number;
    }
}
