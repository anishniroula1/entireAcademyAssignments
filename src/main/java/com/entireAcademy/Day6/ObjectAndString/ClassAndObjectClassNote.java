package com.entireAcademy.Day6.ObjectAndString;

public class ClassAndObjectClassNote {
    public static void main(String[] args) {
//        String address = "123 test street";
//
//        House house =
//                new House(address, "Test City", "State", 3, 3);
//
//        System.out.println(house.getAddress());

//        House secondHouse = new House();
//        secondHouse.setAddress(address);
//
//
//        System.out.println(secondHouse.getCity());
//        House thirdHouse;
//        if (true) {
//            thirdHouse = new House();
//            thirdHouse.setAddress(address);
//            System.out.println(thirdHouse.getAddress());
//        }

        String greeting = "Hello, World!";
        int length = greeting.length();
        char firstChar = greeting.charAt(0);
//
//        System.out.println(firstChar);
        String getHello = greeting.substring(0, 5);
//        System.out.println(getHello);

//        String sentence = "The String class is a special class in Java " +
//                "used to represent a sequence of characters. Strings are " +
//                "useful for storing and manipulating text. Some common " +
//                "methods of the String class are length(), charAt(), " +
//                "substring(), indexOf(), and equals().";
//
//        int indexOfManipulating = sentence.indexOf("manipulating");
//        int indexOfLength = sentence.indexOf("length()");
//        String sentenceAfterManupulating = sentence.substring(indexOfManipulating, indexOfLength);
//        System.out.println(sentenceAfterManupulating);

//        String getLastFour = greeting.substring(2, greeting.length() - 4);
//        System.out.println(getLastFour);

        String firstName = "Mike";
        firstName = "David";
        String secondName = "Mike";

        boolean isSame = firstName.equals(secondName);

        System.out.println(firstName);

    }
}
