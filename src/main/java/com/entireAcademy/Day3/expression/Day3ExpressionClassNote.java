package com.entireAcademy.Day3.expression;

public class Day3ExpressionClassNote {
    public static void main(String[] args) {
//        int number = 20;
//        String name = "My Name is Anish";
//        boolean hasName = name.contains("Anish");
//        if (hasName) {
//            // statement
//            System.out.println("Name exist");
//        } else {
//            System.out.println("Name doesn't exist");
//        }

        /*
        == (equal)
        != (not equal)
        > (greater than)
        < (less than)
        >= (greater than or equal to)
        >= (less than or equal to)
         */
//        int grade = 100;
//        if (grade <= 99) {
//            System.out.println("Grade is 100");
//        } else {
//            System.out.println("Grade is not available");
//        }

//        boolean a = false;
//        boolean b = false;
//
//        if ((!a || b) || b) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }

//        String name = "Anish";
//        int grade = 80;
//        boolean hasCar = true;
//
//        if (name.contains("Anish") || (grade > 100 && hasCar)) {
//            System.out.println("first");
//        } else if (name.contains("Anish") && grade <= 80) {
//            System.out.println("second");
//        } else if (name.contains("Anish") || grade > 80) {
//            System.out.println("third");
//        } else if (name.contains("Suman") && grade >= 80 || !hasCar) {
//            System.out.println("fourth");
//        } else {
//            System.out.println("last");
//        }

//        int grade = 70;
//        switch (grade) {   // grade == 80
//            case 80: // grade == 80
//                System.out.println("B");
//                break;
//            case 90: // grade == 90
//                System.out.println("A");
//                break;
//            case 100: // grade == 100
//                System.out.println("A+");
//                break;
//            case 101: // grade == 101
//                System.out.println("Excellent");
//                break;
//            default: //
//                System.out.println("D");
//                break;
//        }

//        String name = "Geetax";
//        switch (name) {
//            case "Suman":
//                System.out.println("Suman");
//                break;
//            case "Geeta":
//                System.out.println("Geeta");
//                break;
//            default:
//                System.out.println("NO Name");
//                break;
//        }

        // Ternary operator
        int num = 10;
        boolean checkGrade = num > 2 ? true : false;
        String getGrade = num > 2 ? "A" : "F";
        System.out.println(checkGrade);

    }

}