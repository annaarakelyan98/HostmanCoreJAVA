package org.javacore.chapter_4.point_9_comments;

import java.time.LocalDate;

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    private static String surname = "Karmen";

    Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public static String getSurname() {
        return surname;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    /**
     * @param byPercent the percentage by which to raise the salary (e.g., 10 means 10%)
     * @return the amount of the raise
     */
    public double raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
        return raise;
    }
}

public class EmployeesDemo {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        employees[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        employees[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        for (Employee employee : employees) {
            employee.raiseSalary(5);

            System.out.println("name: " + employee.getName() + ", salary: " + employee.getSalary()
                    + ", hire date: " + employee.getHireDay());
        }

        System.out.println(Employee.getSurname());
    }
}

