package com.entireAcademy.Day5.MethodAndCommandLineIO;

import java.util.Arrays;

public class MethodAndCommandLineIOClassNote {

    public static int sum(int a, int b) {
        int add = a + b;
        return add;
    }

    public static void main(String[] args) {

//        System.out.println(sum(30, 40));
//        System.out.println(sum(20, 10));
//        System.out.println(sum(9, 9));
//        System.out.println(findMax(4, 2));
//        String sentence = new String("My name is Suman");
//        System.out.println(findName(sentence, "Anish"));
//        System.out.println(findName("I am from Columbus", "from"));

        methodRankPoints(100);

    }

    public static int findMax(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static String findName(String sentence, String name) {
        if (sentence.contains(name)) {
            return name + " found in the sentence.";
        }
        return "Name not found in the sentence";
    }

    public static void methodRankPoints(double points) {
        if (points >= 202.5) {
            System.out.println("Rank:A1");
        }else if (points >= 122.4) {
            System.out.println("Rank:A2");
        }else {
            System.out.println("Rank:A3");
        }
    }



}
