package com.example.business;

/**
 * Created by enogrob on 9/19/15.
 */
public class Manager extends Employee {
    private String deptName;
    public Manager(int id, String name, String ssn, double salary, String department) {
        super(id, name, ssn, salary);
        this.deptName = department;
    }
    public  String getDeptName () {
        return deptName;
    }
}
