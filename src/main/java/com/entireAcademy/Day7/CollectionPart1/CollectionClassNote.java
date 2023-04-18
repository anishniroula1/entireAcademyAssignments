package com.entireAcademy.Day7.CollectionPart1;

import com.entireAcademy.Day9.OOPPart1.ClassesExercise.Person;

import java.util.*;

public class CollectionClassNote {
    public static void main(String[] args) {
//        int[] numbers = {1,2,3,4,5,6,7};
//
//        for (int i = 0; i<numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

//        int i = 0;
//        for(int num : numbers) {
//            System.out.println(i);
//            i++;
//        }

//        String[] fruits = {"Mango", "Apple", "Banana"};
//        for (String fruit : fruits) {
//            if (fruit.equals("Mango")) {
//                System.out.println(fruit + " found");
//            }
//            else {
//                System.out.println(fruit);
//            }
//        }

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);


//        Integer getThirdIndex = numbers.get(3);
//        numbers.remove(3);

//        System.out.println(numbers.size());
//
//        System.out.println(numbers);
//
//        for (int num : numbers) {
//            System.out.println(num);
//        }


//        ArrayList<String> fruitsName = new ArrayList<>();
//        fruitsName.add("Mango");
//        fruitsName.add("Apple");
//        fruitsName.add("Banana");
//
////        fruitsName.get(3);
//        Boolean hasFruit = fruitsName.contains("Bananaa");
//
//        System.out.println(hasFruit);
//
//        for (String fruit: fruitsName) {
//            System.out.println(fruit);
//        }

        // Autoboxing
//        int i = 10;
//        Integer x = i;
//
//        char letter = 'L';
//        Character y = letter;

        // Unboxing
//        Integer num = 10;
//        int z = num;

        // Queue

        Queue<String> personNames = new LinkedList<>();

        personNames.add("Bob");
        personNames.add("Sam");

//        personNames.remove();
//        personNames.remove();
//
//        Boolean hasNames = personNames.isEmpty();
//
//        System.out.println(personNames.size());

        for (String name : personNames) {
            System.out.println(name);
        }
    }


}
