package com.entireAcademy.Day10.OOPPart2.AbstractionClassNote.Shape;

public class AbstractionClassNote {
    public static void main(String[] args) {
        Circle circle = new Circle(20.0);

        Rectangle rectangle = new Rectangle(20, 30);

        System.out.println(circle.getShapeColor("red"));
    }
}
