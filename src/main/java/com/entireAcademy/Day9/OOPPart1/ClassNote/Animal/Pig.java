package com.entireAcademy.Day9.OOPPart1.ClassNote.Animal;

public class Pig extends Animal {
    String legs;

    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

    public void animalSound(String sound) {
        System.out.println("The pig Make a " + sound);
    }

    public String getLegs() {
        return legs;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }
}
