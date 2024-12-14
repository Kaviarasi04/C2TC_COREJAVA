package com.kaviarasi.assignment;

public class Leader extends Worker {
    private String department;

    public Leader(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
