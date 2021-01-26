package com.company;

import java.util.Date;

public class Employee implements IEmployee {
    private int id;
    private String name;
    private double salary;
    private int vacationDays;
    private int yearOfExperience;

    public Employee(int id, String name, double salary, int vacationDays, int yearOfExperience) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.vacationDays = vacationDays;
        this.yearOfExperience = yearOfExperience;
    }

    @Override
    public void getInfo() {
        System.out.println(" Employee: \n  Name: "+name+"\n  Salary: "+ salary
                            +"\n  Vacation days: "+vacationDays);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.VisitEmployee(this);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }
}
