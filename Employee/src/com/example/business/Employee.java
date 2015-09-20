package com.example.business;

/**
 * Created by enogrob on 9/19/15.
 */
public class Employee {
    private int id;
    private String nameOftheEmployee;
    private String socialSecurityNumberOftheEmployee;
    private double salaryOfTheEmployee;
    public Employee(int id, String name, String ssn, double salary) {
        this.id = id;
        this.nameOftheEmployee = name;
        this.socialSecurityNumberOftheEmployee = ssn;
        this.salaryOfTheEmployee = salary;
    }

    public int getId() {
        return id;
    }

    public String getNameOftheEmployee() {
        return nameOftheEmployee;
    }

    public void setNameOftheEmployee(String nameOftheEmployee) {
        this.nameOftheEmployee = nameOftheEmployee;
    }

    public String getSocialSecurityNumberOftheEmployee() {
        return socialSecurityNumberOftheEmployee;
    }

    public double getSalaryOfTheEmployee() {
        return salaryOfTheEmployee;
    }

    public void raiseSalary(double increase){
        this.salaryOfTheEmployee += increase;
    }

    public String toString() {
        return " com.example.business.Employee id:" + getId() + "\n" +
                "com.example.business.Employee name: " + getNameOftheEmployee() + "\n" +
                "com.example.business.Employee SSN: " + getSocialSecurityNumberOftheEmployee() + "\n" +
                "com.example.business.Employee Salary:" + getSalaryOfTheEmployee() + "\n";
    }

}


