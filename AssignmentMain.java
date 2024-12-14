package com.kaviarasi.assignment;
import com.kaviarasi.assignment.Manager;
import com.kaviarasi.assignment.Developer;
import com.kaviarasi.assignment.EmployeeUtilities;
public class AssignmentMain {
public static void main(String[] args) {
Manager manager = new Manager("John", 101, 90000, "Sales");
Developer developer = new Developer("Alice", 102, 80000, "Java");
EmployeeUtilities.printEmployeeDetails(manager);
EmployeeUtilities.printEmployeeDetails(developer);
}
}
