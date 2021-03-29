package com.shubham;

public class Main {

    // public - Access Modifier

    // static - When java runtime starts, there is no object of the class present.
    // That’s why the main method has to be static so that JVM can load the class into memory and call the main method.
    // If the main method won’t be static, JVM would not be able to call it because there is no object of the class is present.

    // void - Return Type. Java main method does’t return anything, that’s why it’s return type is void.

    // main - Java main method is the entry point of any java program.

    // String[] - Java main method accepts a single argument of type String array. This is also called as java command line arguments. 

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");
    }
}
