package com.entireAcademy.Day10.OOPPart2.AbstractionClassNote.Animal;

public class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("Bow bow");
    }

    @Override
    public void eats() {
        System.out.println("Rice and Chicken");
    }

    public String doesItClimbTree() {
        return "It doesn't but it tries";
    }
}
