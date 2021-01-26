package com.company;
//Kalimbetova Aray
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<IEmployee> allEmployees=new ArrayList<>();
        Employee Anna = new Employee(20, "Anna", 1000, 21, 3);
        Employee Din = new Employee(95, "Din", 800, 20, 1);
        Employee Bob = new Employee(111, "Bob", 600, 18, 1);

        Clerk Sammy = new Clerk(18, "Sammy", 800, 20, 4);
        Clerk Emma = new Clerk(58, "Emma", 650, 16, 1);
        Clerk Jane = new Clerk(39, "Jane", 700, 18, 2);

        allEmployees.add(Anna);
        allEmployees.add(Din);
        allEmployees.add(Bob);
        allEmployees.add(Sammy);
        allEmployees.add(Emma);
        allEmployees.add(Jane);

        IVisitor increaseSalaryVisitor = new IncreaseSalaryVisitor();
        IVisitor increaseVacationVisitor = new IncreaseVacationVisitor();
        IVisitor sortVisitor = new SortVisitor();

        for (IEmployee e:allEmployees) {
            System.out.println("---------------------------------");
            e.accept(increaseSalaryVisitor);
            e.accept(increaseVacationVisitor);
            e.accept(sortVisitor);
        }

        System.out.println();

        System.out.println("List of employees");
        for (Employee e:((SortVisitor) sortVisitor).getEmployees()) {
            e.getInfo();
        }
        System.out.println("------------------------------------------------");
        System.out.println("List of clerks");
        for (Clerk c:((SortVisitor) sortVisitor).getClerks()) {
            c.getInfo();
        }
    }
}
