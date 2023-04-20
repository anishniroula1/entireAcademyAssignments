package com.entireAcademy.Day10.OOPPart2.AbstractionClassNote.Animal;

public abstract class Animal {

    public abstract void sound();
    public abstract void eats();

    public String doesItClimbTree() {
        return "No it doesn't climb tree";
    }
}
