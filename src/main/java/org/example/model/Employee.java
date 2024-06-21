package org.example.model;

public class Employee {

    private final String fullName;
    private String department;
    private double salary;
    public static int count;
    private final int id;

    public Employee(String fullName, String department, double salary) {
        count++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = count;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
