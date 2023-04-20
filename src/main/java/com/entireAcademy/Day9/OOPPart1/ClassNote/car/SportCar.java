package com.entireAcademy.Day9.OOPPart1.ClassNote.car;

public class SportCar {
    private String carType;
    private String engineType;

    public SportCar(String carType, String engineType) {
        this.carType = carType;
        this.engineType = engineType;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
