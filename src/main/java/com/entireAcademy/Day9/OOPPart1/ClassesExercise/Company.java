package com.entireAcademy.Day9.OOPPart1.ClassesExercise;

public class Company {

    private String name;
    private int numberOfEmployees;

    private double revenue;

    private double expenses;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    public String getCompanySize() {
        if (numberOfEmployees >= 51 && numberOfEmployees <= 250) {
            return "medium";
        }
        else if (numberOfEmployees <= 50) {
            return "small";
        } else {
            return "large";
        }
    }

    public double getProfit() {
        return revenue - expenses;
    }
}
