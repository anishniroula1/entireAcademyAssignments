package com.entireAcademy.Day4.ArraysLoop;

import java.util.Arrays;

public class ArrayAndLoopsClassNote {
    public static void main(String[] args) {
//        int[] myArray = new int[3];
//        try {
//            myArray[0] = 1;
//            myArray[1] = 2;
//            myArray[2] = 3;
//            System.out.println(Arrays.toString(myArray));
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        }
//
//        int[] secondArray = {1,2,3,4,5,6745,323,2323,232,32,323,23,23,232,323};
//        System.out.println(Arrays.toString(secondArray));

//        for (// initilization, condition, increment or decrement) {
//        statement
//        i = i + 1;
//        i = i -1
//        for (int i = 0; i < 10; i++) {
//            if (i % 2 == 1) {
//                System.out.println(i);
//            }
//        }

//        int[][] multiDim = {{1,2,3}, {3,4,5}, {6,4,2}};

//        String[] name = {"Anish", "Ganesh", "Suman", "mamta"};
//        System.out.println(name[0]);
//        name[2] = "Shyam";

//        for (int i = 0; i < name.length; i++) {
//            if (i == 2) {
//                name[i] = "Ram";
//            }
//            System.out.println(name[i]);
//        }

//        // initilization
//        while (//condition) {
//        //statement
//        // increment or decrement
//    }
//        int i = 0;
//        while (i < 10) {
//            if (i == 4) {
//                break;
//            }
//            System.out.println(i);
//            i++;
//        }

        // initilization
//        do {
//            // statement
//                increment
//        } while (//condition);

//        int i = 0;
//
//        do {
//            if (i % 2 == 1) {
//                System.out.println(i);
//            }
////            System.out.println(i);
//            i++;
//        } while (i < 10);

//        int i = 5;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i <= 4);

//        String[] name = {"Anish", "Ganesh", "Suman", "mamta"};


        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j <= 5; j++) {
                    System.out.println("J: " + j);
                }
            }
            System.out.println("i: " + i);
        }

    }

    }
