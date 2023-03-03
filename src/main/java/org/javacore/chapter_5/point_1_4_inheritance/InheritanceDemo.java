package org.javacore.chapter_5.point_1_4_inheritance;

import java.time.LocalDate;

public class InheritanceDemo {
    public static void main(String[] args) {
        Manager manager = new Manager("Boss/Manager", 1000000, 2021, 10, 21);
        manager.setBonus(200000);

        Employee[] staff = new Employee[3];

        staff[0] = manager;
        staff[1] = new Employee("Ann", 200000, 2022, 2, 14);
        staff[2] = new Employee("Arman", 1000000, 2021, 4, 15);

        for (Employee e : staff) {
            System.out.println("Name: " + e.getName() + ", salary: " + e.getSalary());
        }
    }
}

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        this.name = n;
        this.salary = s;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}