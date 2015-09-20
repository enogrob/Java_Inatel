package com.example.business;

/**
 * Created by enogrob on 9/19/15.
 */
public class Director extends Employee {
    private String department;
    public Director (int id, String name, String ssn, double salary, String department) {
        super(id, name, ssn, salary);
        this.department = department;
    }
}
