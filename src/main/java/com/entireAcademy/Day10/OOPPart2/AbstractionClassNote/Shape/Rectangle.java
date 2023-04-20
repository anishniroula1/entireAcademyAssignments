package com.entireAcademy.Day10.OOPPart2.AbstractionClassNote.Shape;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String getShapeName() {
        return "Rectangle";
    }
}
