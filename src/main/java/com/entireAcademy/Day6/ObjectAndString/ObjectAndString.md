## Objects as a programming construct
Objects are the building blocks of Java programming. Think of them like real-life objects, such as a ball or a car. In Java, objects have properties (like color, size) and methods (like actions they can perform). For example, a car object might have properties like its color, make, and model and methods like startEngine() and stopEngine().

## Objects, classes, and their relationship
A class is like a blueprint for an object. It defines the properties and methods an object should have. When we create an object using a class, we say we are instantiating the object. The object is an instance of the class, and it has its own set of properties and methods.

![image](https://lh6.googleusercontent.com/upqSoM_B4YXiB82dM9TNlpDxr9XQdnkSnIzSPg8XZbf2QE78In6ydh9Hhd4sKobmaceSjs11DqJUbMrkY4kshtPbg8y6_Hg7DIkKoASO9VTu4oR_TR4wqNmkzDUla9AxmbEKBix3ut1XHLg01VHRI2E)

### For example, imagine we have a class called Car:

```java
class Car {

    String color;
    String make;
    String model;

    public void startEngine() {
        // Code to start the engine
    }
    
    public void stopEngine() {
        // Code to stop the engine
    }
}
```

We can create objects (instances) of the Car class like this:
```java
Car car1 = new Car();
Car car2 = new Car();
```
3. Instantiating and using objects

To create an object, we use the new keyword followed by the class name and parentheses. Here's an example using our Car class:

`Car myCar = new Car();`

Now, let's set some properties for myCar:
```java
myCar.color = "Red";
myCar.make = "Toyota";
myCar.model = "Corolla";
```
We can also call methods on myCar:

`myCar.startEngine();`

## Declare, Instantiate, and Initialize
- Declare: When we declare a variable, we tell the computer to reserve memory to store a value of a specific type. For example:
`Car myCar; // Declare a Car variable`
- Instantiate: When we instantiate an object, we create a new instance (object) of a class using the new keyword:
`myCar = new Car(); // Instantiate a Car object`
- Initialize: Initialization is when we assign an initial value to a variable. In our case, when we instantiate an object, we can initialize its properties:
`myCar.color = "Red"; // Initialize the color property`

## Objects in RAM
Objects are stored in a part of your computer's memory called the heap. When you create an object, Java automatically allocates memory on the heap for the object's properties and methods. A reference to the object's location in the heap is stored in a variable (like myCar).

## Stack, Heap, and Primitives
- `Stack`: The stack is an area of memory where Java stores local variables and method call information. Primitive data types (like int, double, boolean, etc.) are stored directly on the stack. They are called value types.
- `Heap`: The heap is an area of memory where Java stores objects. When you create an object, it is stored on the heap. The object's reference is stored on the stack.

## Value-type and Reference-type
- Value-type: Primitive data types (like int, double, boolean, etc.) are value types. They store the actual value directly in memory.
- Reference-type: Reference types are used for objects. They store a reference (memory address) to the object's location in the heap. When you create an object, you are actually creating a reference to the object in memory. Examples of reference types are arrays, strings, and objects created from classes.
```java
public class MemoryExample {
public static void main(String[] args) {
    // Create two instances of Person class
    Person person1 = new Person("John", 25);
    Person person2 = new Person("Jane", 30);
    
    // Print the names of the two persons
    System.out.println(person1.getName());
    System.out.println(person2.getName());
    }
}

class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
}
```
Here's how Heap and Stack memory would be used for this program:

|          |                                                     |                                                         |
| -------- | --------------------------------------------------- | ------------------------------------------------------- |
| **Step** | **Heap Memory**                                     | **Stack Memory**                                        |
| 1        | Empty                                               | Empty                                                   |
| 2        | Person class definition loaded into memory          | main() function added to the Stack                      |
| 3        | person1 variable created on the Stack               | args array added to the Stack                           |
| 4        | person2 variable created on the Stack               | person1 variable initialized on the Heap                |
| 5        | Person object created on the Heap for person1       | person2 variable initialized on the Heap                |
| 6        | Person object created on the Heap for person2       | System.out.println() method called with person1         |
| 7        | person1 initialized with reference to Person object | System.out.println() method called with person2         |
| 8        | person2 initialized with reference to Person object | main() function removed from the Stack                  |
| 9        | System.out.println(person1.getName()) called        | Stack is now empty                                      |
| 10       | person1.getName() called and returns "John"         | Garbage collector runs and frees memory used by person1 |
| 11       | System.out.println(person2.getName()) called        | Heap memory now empty                                   |
| 12       | person2.getName() called and returns "Jane"         |                                                         |

In this example, the Person objects for person1 and person2 are created on the Heap using the new keyword, while the person1 and person2 variables are created on the Stack. The System.out.println() method calls then access the getName() method of the Person objects, which are stored on the Heap.

Finally, the garbage collector runs and frees the memory used by the person1 object, as it is no longer needed.

## String class, its purpose, and use

The String class is a special class in Java used to represent a sequence of characters. Strings are useful for storing and manipulating text. Some common methods of the String class are length(), charAt(), substring(), indexOf(), and equals().

Example:
```java
String greeting = "Hello, World!";

int length = greeting.length(); // Get the length of the string

char firstChar = greeting.charAt(0); // Get the first character

String hello = greeting.substring(0, 5); // Get the substring "Hello"

int indexOfWorld = greeting.indexOf("World"); // Find the index of "World"
```
## Calling methods on an object
To call a method on an object, use the object's reference followed by the dot operator (.) and the method name with parentheses. The method may return a value based on its signature.

Example:
```
String greeting = "Hello, World!";
int length = greeting.length(); // Call the length() method on the greeting object
```
## Immutability and handling objects
Some objects, like strings, are immutable, meaning their state cannot be changed after they are created. When you perform an operation on an immutable object, a new object is created, and the original object remains unchanged.
Example:
```
String original = "Hello, World!";
String uppercase = original.toUpperCase(); // Create a new string with all uppercase letters
```
## Object equality and == vs equals()
When comparing objects, it's important to know the difference between == and equals(). The == operator checks if two object references point to the same object in memory. The equals() method checks if two objects are equal based on their content.
Example:
```java
String str1 = new String("Hello");
String str2 = new String("Hello");
boolean isEqualUsingOperator = (str1 == str2); // false, because they are different objects in memory
boolean isEqualUsingMethod = str1.equals(str2); // true, because their content is the same
```
In summary, we've learned about objects, classes, and their relationship, as well as how to instantiate, use, and compare objects. We've also explored the difference between value types and reference types, and how they are stored in memory. Keep practicing, and you'll become a Java expert in no time!
