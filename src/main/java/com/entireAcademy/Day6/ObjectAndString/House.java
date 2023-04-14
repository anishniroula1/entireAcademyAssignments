package com.entireAcademy.Day6.ObjectAndString;

public class House {
    private String address;
    private int numbersOfRoom;
    private int numbersOfBathroom;
    private String city;
    private String state;

//    public House() {
//
//    }

//    public House(String address, String city, String state,
//                 int numbersOfRoom, int numbersOfBathroom) {
//        this.address = address;
//        this.city = city;
//        this.numbersOfRoom = numbersOfRoom;
//        this.state = state;
//        this.numbersOfBathroom = numbersOfBathroom;
//    }

    public String getAddress() {
        return address;
    }

    public int getNumbersOfRoom() {
        return numbersOfRoom;
    }

    public int getNumbersOfBathroom() {
        return numbersOfBathroom;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumbersOfRoom(int numbersOfRoom) {
        this.numbersOfRoom = numbersOfRoom;
    }

    public void setNumbersOfBathroom(int numbersOfBathroom) {
        this.numbersOfBathroom = numbersOfBathroom;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }
}
