### Java Basic

* Java is a class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.

* Java is a high-level programming language originally developed by Sun Microsystems and released in 1995.

##### Why to Learn java Programming?

* Object Oriented − In Java, everything is an Object. Java can be easily extended since it is based on the Object model.

* Platform Independent − Unlike many other programming languages including C and C++, when Java is compiled, it is not compiled into platform specific machine, rather into platform independent byte code. This byte code is distributed over the web and interpreted by the Virtual Machine (JVM) on whichever platform it is being run on.

* Secure − With Java's secure feature it enables to develop virus-free, tamper-free systems. Authentication techniques are based on public-key encryption.

```java
public class MyFirstJavaProgram {

   /* This is my first java program.
    * This will print 'Hello World' as the output
    */

   public static void main(String []args) {
      System.out.println("Hello World"); // prints Hello World
   }
}
```
CMD - javac Main.java
![execution](https://i.imgur.com/mUOa3p7.png)

##### Applications of Java Programming

* The latest release of the Java Standard Edition is Java SE 8. With the advancement of Java and its widespread popularity, multiple configurations were built to suit various types of platforms. For example: J2EE for Enterprise Applications, J2ME for Mobile Applications.

* The new J2 versions were renamed as Java SE, Java EE, and Java ME respectively. Java is guaranteed to be Write Once, Run Anywhere.


##### Notes:

* Class - The car has attributes, such as weight and color, and methods, such as drive and brake. A Class is like an object constructor, or a "blueprint" for creating objects. Pascal Case.

* Objects - In Java, an object is created from a class. We have already created the class named MyClass, so now we can use this to create objects.
  To create an object of MyClass, specify the class name, followed by the object name, and use the keyword new:

```java
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
```

* Access Modifiers - The access modifiers in Java specifies the accessibility or scope of a field, method, constructor, or class.

    1. Private - The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
    2. Default - The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
    3. Protected - The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.
    4. Public - The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.

##### Types:

1. Primitive Types - For storing simple values. Copy by the values.
   ![img](https://i.imgur.com/DBYVRWN.png)
2. Reference Types - For storing complex objects. Copy by the references.

* The main difference between primitive and reference type is that primitive type always has a value, it can never be null but reference type can be null, which denotes the absence of value.
* So if you create a primitive variable of type int and forget to initialize it then it's value would be 0, the default value of integral type in Java, but a reference variable by default has a null
* In short, the main difference between the two types is that primitive types store actual values but reference type stores handle to object in the heap.

##### Arrays:

* Java array is an object which contains elements of a similar data type. Additionally, The elements of an array are stored in a contiguous memory location. It is a data structure where we store similar elements. We can store only a fixed set of elements in a Java array.

```
int[] numers2 = {1,2,3,4};

int[][] twoDim = new int[2][3];
twoDim[0][0] = 1;
```