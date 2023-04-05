package com.entireAcademy.Day3.expression;

public class ExpressionClassQuiz {
    public static void main(String[] args) {
//        int number = 11;
//        if (number % 2 == 0) {
//            System.out.println("The number is even.");
//        } else {
//            System.out.println("The number is odd.");
//        }


//        int number = -10;
//
//        if (number > 0) {
//            System.out.println("The number is positive.");
//        } else if (number < 0) {
//            System.out.println("The number is negative.");
//        } else {
//            System.out.println("The number is zero.");
//        }



        int grade = 100;
        switch (grade / 10) {
            case 10:
            case 9:
                System.out.println("Your letter grade is A.");
                break;
            case 8:
                System.out.println("Your letter grade is B.");
                break;
            case 7:
                System.out.println("Your letter grade is C.");
                break;
            case 6:
                System.out.println("Your letter grade is D.");
                break;
            default:
                System.out.println("Your letter grade is F.");
                break;
        }

    }
}
