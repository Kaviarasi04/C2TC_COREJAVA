package com.kaviarasi.assignment;

public class CompanyRunner {
    public static void main(String[] args) {
        Leader leader = new Leader("John", 101, 90000, "Sales");
        Programmer programmer = new Programmer("Alice", 102, 80000, "Java");

        EmployeeHelper.printEmployeeDetails(leader);
        EmployeeHelper.printEmployeeDetails(programmer);
    }
}
