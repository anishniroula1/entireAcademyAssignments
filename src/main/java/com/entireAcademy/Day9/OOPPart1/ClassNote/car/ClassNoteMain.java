package com.entireAcademy.Day9.OOPPart1.ClassNote.car;

public class ClassNoteMain {
    public static void main(String[] args) {
        Car car = new Car("Abarth", "VW Golf R");
//        car.setCarType("Abarth");
//        car.setEngineType("VW Golf R");

        System.out.println(car.getEngineType());
    }
}
