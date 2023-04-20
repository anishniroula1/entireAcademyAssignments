package com.entireAcademy.Day9.OOPPart1.ClassNote.car;


public class Car extends SportCar {
    private int speed;
    private String color;
    private String make;
    private String model;

    public Car(String carType, String engineType) {
        super(carType, engineType);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String combineCarInformation() {
        String modelAndSpeed = this.model + " " + this.speed;
        String combineAll = combineColorAndMake() + " " + modelAndSpeed;
        return combineAll;
    }

    private String combineColorAndMake() {
        String makeAndColor = this.make + " " + this.color;
        return makeAndColor;
    }

    public String getSportCarType() {
        return this.getCarType();
    }
}
