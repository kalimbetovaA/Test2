package com.company;

import java.util.ArrayList;

public class SortVisitor implements IVisitor{
    private ArrayList<Employee> employees=new ArrayList<>();
    private ArrayList<Clerk> clerks=new ArrayList<>();

    @Override
    public void VisitEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee "+employee.getName()+" added to new employees list!");
    }

    @Override
    public void VisitClerk(Clerk clerk) {
        clerks.add(clerk);
        System.out.println("Clerk "+clerk.getName()+" added to new clerks list!");
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public ArrayList<Clerk> getClerks() {
        return clerks;
    }
}
