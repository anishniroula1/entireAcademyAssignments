package com.entireAcademy.Day10.OOPPart2.AbstractionClassNote.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public String getShapeColor(String color) {
        return color;
    }
}
