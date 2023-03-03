package org.javacore.chapter_5.point_1_9_abstraction;

import java.awt.*;
import java.time.LocalDate;
import java.util.Objects;

public class AbstractClassDemo {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        people[0] = new Employee("Arman Arakelyan", 1000000, 2020, 5, 15);
        people[1] = new Student("Ann Arakelyan", "computer science");

        for (Person p : people) {
            System.out.println(p.getName() + " : " + p.getDescription());
        }

        //hash checking
        String s = "OK";
        StringBuilder sb = new StringBuilder(s);

        System.out.println(s.hashCode() + " " + sb.hashCode());

        String t = new String("Ok");
        StringBuilder tb = new StringBuilder(t);
        String poxos = null;
        System.out.println(t.hashCode() + " " + tb.hashCode() /*+ " " + poxos.hashCode()*/);

        Employee employee = new Employee("Poxos", 100454, 2019,4,21);

        System.out.println(employee.hashCode());
    }
}

abstract class Person {
    public abstract String getDescription();

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Employee extends Person {
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double d, int year, int month, int day) {
        super(name);
        this.salary = d;
        hireDay = LocalDate.of(year, month, day);
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", salary);
        //return "an employee with a salary of " + getSalary(); - is the same
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    //combine hash values
    public int hashCode(){
        return Objects.hash(super.getName(),salary, hireDay);
    }
}

class Student extends Person {
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    public String getDescription() {
        return "a student majoring in " + major;
    }
}