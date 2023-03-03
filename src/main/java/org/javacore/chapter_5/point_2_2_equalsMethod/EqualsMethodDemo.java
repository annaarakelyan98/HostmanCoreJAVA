package org.javacore.chapter_5.point_2_2_equalsMethod;

import java.time.LocalDate;
import java.util.Objects;

public class EqualsMethodDemo {
    public static void main(String[] args) {
        Employee alice1 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        Employee bob = new Employee("Bob Brandon", 50000, 1989, 10, 1);

        System.out.println("alice1 == alice2: " + (alice1 == alice2));

        System.out.println("alice1 == alice3: " + (alice1 == alice3));

        System.out.println("alice1.equals(alice3): " + alice1.equals(alice3));

        System.out.println("alice1.equals(bob): " + alice1.equals(bob));

        System.out.println("bob.toString(): " + bob);

        Manager carl = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        System.out.println("boss.toString(): " + boss);

        System.out.println("carl.equals(boss): " + carl.equals(boss));

        System.out.println("alice1.hashcode(): " + alice1.hashCode());

        System.out.println("alice3.hashcode(): " + alice3.hashCode());

        System.out.println("bob.hashcode(): " + bob.hashCode());

        System.out.println("carl.hashcode(): " + carl.hashCode());
    }
}

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
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

    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;

        Employee other = (Employee) otherObject;

        return Objects.equals(name, other.name)
                && salary == other.salary
                && Objects.equals(hireDay, other.hireDay);
    }

    public int hashCode() {
        return Objects.hash(name, salary, hireDay);
    }

    public String toString() {
        return "Employee{" +
                "name=" + name +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}

class Manager extends Employee {
    private int bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return bonus == manager.bonus;
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), bonus);
    }
}