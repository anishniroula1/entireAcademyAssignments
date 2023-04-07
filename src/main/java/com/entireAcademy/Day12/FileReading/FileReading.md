# Java File Reading

Welcome to the exciting world of coding! In this tutorial, we will learn how to read files in Java. Just like you'll read words in a book, a computer can read data from a file.

Reading files is essential because it allows us to access and process the information stored in them. So let's get started!

## Table of Contents
- [Why Read Files?](#why-read-files)
- [How to Read a File in Java](#how-to-read-a-file-in-java)
- [Examples of Reading Files](#examples-of-reading-files)

## Why Read Files?

When we work with computers and write programs, we often need to store and process information. One of the most common ways to do this is by using files.

Files are like containers that hold data, which can be text, numbers, images, or any other type of information. By reading files, we can access the data inside them and use it in our programs.

Java provides several tools and techniques for reading files, and we will explore some of these methods in this tutorial.

## How to Read a File in Java

In Java, we can use various classes and methods to read files, such as:

1. `FileReader` and `BufferedReader`
2. `Scanner`
3. `Files` and `Paths`
4. `FileInputStream`

In each example, we'll see how to use these classes and methods to read a file called "example.txt" that contains the following text:

```
Hello, I'm a file.
I contain some text.
I like Java!
```

Now, let's dive into each of these methods and see how they work.

## Examples of Reading Files

### Using FileReader and BufferedReader:
The `FileReader` class is used for reading character files, while the `BufferedReader` can read text from a character stream more efficiently.

Here's an example of how to use `FileReader` and `BufferedReader`:

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("example.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### Using Scanner:
The `Scanner` class can be used to read text from various sources, including files. It provides methods to read text line by line, word by word, or using regular expressions.

Here's an example of how to use `Scanner`:

```java
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### Using Files and Paths:
The `Files` and `Paths` classes are part of the Java NIO (New Input/Output) package, which provides more advanced features for working with files and directories.

Here's an example of how to use `Files` and `Paths`:

```java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFileExample {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("example.txt"));

            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### Using FileInputStream:
The `FileInputStream` class reads bytes from a file. It is mainly used for reading binary files, but we can use it to read text files as well.

Here's an example of how to use `FileInputStream`:

```java
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFileExample {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("example.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

            int data;
            while ((data = inputStreamReader.read()) != -1) {
                char character = (char) data;
                System.out.print(character);
            }

            inputStreamReader.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

## Reading a CSV File
Comma-separated values (CSV) files are commonly used to store and exchange data. Here's an example of how to read a CSV file using Java:

```java
import java.io.*;
import java.util.*;

public class CsvFileReadingExample {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("example.csv"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                System.out.println(Arrays.toString(values));
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
Now you know four different methods to read files in Java! Whether you use `FileReader` and `BufferedReader`, `Scanner`, `Files` and `Paths`, or `FileInputStream`, you can start reading and processing text files in your Java programs.

Practice these methods with different file examples to become more confident in your file reading skills. Keep learning and have fun!
