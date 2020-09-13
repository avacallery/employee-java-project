package com.avacallery;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees;

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public static void printNumberOfEmployees() {
        System.out.println(numberOfEmployees);
    }


    public Employee(int baseSalary) {
        this(baseSalary, 0);
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (getHourlyRate() * extraHours);
    }

    public int calculateWage() {
        return calculateWage(0);
    }

    //SETTER
    private void setBaseSalary(int baseSalary) {
        //validate parameter and make sure it isn't set to an invalid state
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less.");

        this.baseSalary = baseSalary;
    }

    //GETTER
    private int getBaseSalary() {
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate cannot be 0 or negative.");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }
}
