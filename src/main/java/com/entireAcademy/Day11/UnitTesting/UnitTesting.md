# Java Unit Testing

Hi there! Today, we're going to learn about Java unit testing. Unit testing is a way to test small pieces ("units") of our code to make sure that it is working correctly. Think of it like checking a math problem's solution to make sure you did it right.

Java offers various tools for unit testing like JUnit, TestNG, and others. In this article, we'll focus on JUnit, which is one of the most widely used.

## Table of Contents
- [What is JUnit?](#what-is-junit)
- [Setting Up JUnit](#setting-up-junit)
- [Creating Your First Unit Test](#creating-your-first-unit-test)
- [JUnit Annotations](#junit-annotations)
- [Assertions](#assertions)

## What is JUnit?
JUnit is a popular tool used for testing Java projects. It provides a set of annotations and assertions to help us test our code in a fast and efficient way. It helps us ensure that our code works as expected.

JUnit tests are usually grouped into test classes, and each test class contains multiple test methods. Each test method typically tests a specific functionality or behavior of the code.

Now let's dive into unit testing and learn how to set up JUnit and create our first test.

## Setting Up JUnit

First, we need to make sure that JUnit is available in our project. If you use a tool like Maven or Gradle to manage your project, you can easily add the JUnit library as a dependency. Here's what you would include in your `pom.xml` file for a Maven project:

```xml
<!-- JUnit dependency: -->
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>
```

For a Gradle project, you would add the following to your `build.gradle` file:

```groovy
dependencies {
    testImplementation 'junit:junit:4.13.2'
}
```

Once you have added the JUnit library to your project, you can start writing your first unit test.

## Creating Your First Unit Test

Now let's create a simple Java class to test. Let's say we have a `Calculator` class that does basic arithmetic operations, like addition and subtraction:

```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
```

Now we will create a test class to test the functionality of the `Calculator` class. A test class usually has the same name as the class you're testing but with a `Test` suffix, e.g., `CalculatorTest`. In this test class, we'll write test methods for the `add` and `subtract` methods of the `Calculator` class.

To create a test class, follow these steps:

1. Create a new Java class called `CalculatorTest` in your project.
2. Import the `org.junit.Test` class.
3. Add test methods to the class.

Here's how our `CalculatorTest` class would look like:

```java
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        // Check if the result is correct.
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5, 3);
        // Check if the result is correct.
    }
}
```

In the test class, we use the `@Test` annotation to tell JUnit that these are test methods. Each test method usually follows these steps:

1. Set up the initial state and create the objects needed for testing.
2. Call the method you want to test.
3. Check if the method returned the expected result.

Now, let's learn some useful annotations in JUnit that help us write better tests.

## JUnit Annotations

JUnit provides several important annotations that we can use to manage our tests. Here are some of the most common ones:

- `@Test`: Marks a method as a test method.
- `@Before`: Marks a method that should be executed before each test.
- `@After`: Marks a method that should be executed after each test.
- `@BeforeClass`: Marks a method that should be executed before all tests in a test class.
- `@AfterClass`: Marks a method that should be executed after all tests in a test class.

Now let's see how we may use these annotations in our `CalculatorTest` class:

```java
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeClass
    public static void setUpBeforeClass() {
        // This method is executed once before all tests.
        System.out.println("Before class");
    }

    @Before
    public void setUp() {
        // This method is executed before each test.
        System.out.println("Before test");
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        System.out.println("Test add");
        int result = calculator.add(5, 3);
        // Check if the result is correct.
    }

    @Test
    public void testSubtract() {
        System.out.println("Test subtract");
        int result = calculator.subtract(5, 3);
        // Check if the result is correct.
    }

    @After
    public void tearDown() {
        // This method is executed after each test.
        System.out.println("After test");
        calculator = null;
    }
}
```

Now it's time to learn how to actually check if our test methods are producing the expected results. That's where assertions come in!

## Assertions

Assertions are special methods provided by JUnit that let us check if our test results are correct. The most commonly used assertions are:

- `assertEquals(expected, actual)`: Asserts that two values are equal.
- `assertNotEquals(expected, actual)`: Asserts that two values are not equal.
- `assertTrue(condition)`: Asserts that a condition is true.
- `assertFalse(condition)`: Asserts that a condition is false.
- `assertNull(object)`: Asserts that an object is null.
- `assertNotNull(object)`: Asserts that an object is not null.

Now let's add assertions to our `CalculatorTest` class:

```java
import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    // ...

    @Test
    public void testAdd() {
        System.out.println("Test add");
        int result = calculator.add(5, 3);
        assertEquals(8, result); // Check if the result is correct.
    }

    @Test
    public void testSubtract() {
        System.out.println("Test subtract");
        int result = calculator.subtract(5, 3);
        assertEquals(2, result); // Check if the result is correct.
    }

    // ...
}
```

Now our test methods are complete, and we can run the tests to see if our `Calculator` class is working correctly.

That's it! You've just learned the basics of Java unit testing using JUnit. Now you can create your own tests to make sure your code is working as expected. Keep practicing and experimenting with different test cases and assertions to become a pro at unit testing. Good luck and happy coding!