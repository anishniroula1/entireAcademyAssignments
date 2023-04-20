package com.entireAcademy.Day9.OOPPart1.ClassNote.Animal;

public class Dog extends Animal {

    @Override
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }

    public void animalSound(String sound) {
        System.out.println("The dog Make a " + sound);
    }
}
