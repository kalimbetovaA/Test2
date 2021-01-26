package com.company;

public class IncreaseSalaryVisitor implements IVisitor{

    @Override
    public void VisitEmployee(Employee employee) {
        if(employee.getYearOfExperience()>=2){
            employee.setSalary(employee.getSalary()*1.15);
            System.out.println("Employee "+employee.getName()+"'s salary increased by 15%!");
        }
    }

    @Override
    public void VisitClerk(Clerk clerk) {
        if(clerk.getYearOfExperience()>=2){
            clerk.setSalary(clerk.getSalary()*1.1);
            System.out.println("Clerk "+clerk.getName()+"'s salary increased by 10%!");
        }
    }
}
