package org.javacore.chapter_4.point_1_dates;

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

    /**  @param byPercent the percentage by which to raise the salary (e.g., 10 means 10%)
     * */
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        for (Employee employee : staff) {
            employee.raiseSalary(5);

            System.out.println("name: " + employee.getName() + ", salary: " + employee.getSalary()
                    + ", hire date: " + employee.getHireDay());
        }

        System.out.println(Employee.getSurname());
    }
}
