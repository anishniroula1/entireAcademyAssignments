package com.entireAcademy.Day5.MethodAndCommandLineIO;
import java.util.Scanner;

public class CommandLineClassNote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write a sentence?");
//        String sentence = scanner.nextLine();
//        System.out.println("Tell me what word you want to replace?");
//        String wordThatWillBeReplace = scanner.nextLine();
//        System.out.println("What you want this word: " + wordThatWillBeReplace + " replace with?");
//        String replaceWord = scanner.nextLine();
//        String newSentence = sentence.replaceAll(wordThatWillBeReplace, replaceWord);
//
//        System.out.println("New Sentence is: " + newSentence);

//        System.out.println("Give me a first number?");
//        int fistNum = scanner.nextInt();
//        System.out.println("Give me a Second number?");
//        int secondNum = scanner.nextInt();
//        System.out.println("Your sum of "
//                + fistNum + " and "
//                + secondNum + " is "+ sum(fistNum, secondNum));

        String question = "What is the password?";
        System.out.println(question);
        String askUserFroPassword = scanner.nextLine();

        while (!askUserFroPassword.contains("hello")) {
            System.out.println(question);
            askUserFroPassword = scanner.nextLine();
        }

        System.out.println("Let go!!!, now begin the math");
        doMath(scanner);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void doMath(Scanner scanner) {
        System.out.println("Give me a first number?");
        int fistNum = scanner.nextInt();
        System.out.println("Give me a Second number?");
        int secondNum = scanner.nextInt();
        System.out.println("Your sum of "
                + fistNum + " and "
                + secondNum + " is "+ sum(fistNum, secondNum));
    }
}
