package com.entireAcademy.Day10.OOPPart2.AbstractionClassNote.Shape;

public abstract class Shape {

    public abstract double getArea();

    public abstract String getShapeName();

    public String getShapeColor(String color) {
        return color;
    }
}
