package com.example.business;

public class Main {

    public static void main(String[] args) {
        Engineer en = new Engineer(101, "Jane Smith", "012-34-467", 120345.27);
    }
    public void printEmployee(Employee e, EmployeeStockPlan esp) {
        printEmployee(e);
        System.out.println("Stock options: " + esp.grantStock(e));
    }
}
