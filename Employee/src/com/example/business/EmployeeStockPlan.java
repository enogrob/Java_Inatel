package com.example.business;

/**
 * Created by enogrob on 9/19/15.
 */
public class EmployeeStockPlan {
    private final int employeeShares = 10;
    private final int managerShares = 100;
    private final int directorShares = 1000;

    public int grantStock(Employee e) {
        if (e instanceof Director) {
            return directorShares;
        } else {
            if (e instanceof Manager) {
               return  managerShares;
            } else {
                return employeeShares;
            }
        }
    }

}
