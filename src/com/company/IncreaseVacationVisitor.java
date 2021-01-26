package com.company;

public class IncreaseVacationVisitor implements IVisitor{

    @Override
    public void VisitEmployee(Employee employee) {
        if(employee.getYearOfExperience()>=2){
            employee.setVacationDays(employee.getVacationDays()+4);
            System.out.println("Employee "+employee.getName()+"'s days of vacation increased by 4 days!");
        }
    }

    @Override
    public void VisitClerk(Clerk clerk) {
        if(clerk.getYearOfExperience()>=2){
            clerk.setVacationDays(clerk.getVacationDays()+2);
            System.out.println("Clerk "+clerk.getName()+"'s days of vacation increased by 2 days!");
        }
    }
}
