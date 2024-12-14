package CompanyApp;

public class EmployeeHelper {
    
    public static void printEmployeeDetails(Worker worker) {
        System.out.println("Employee Name: " + worker.getName());
        System.out.println("Employee ID: " + worker.getEmployeeId());
        System.out.println("Salary: " + worker.getSalary());

        if (worker instanceof Leader) {
            Leader leader = (Leader) worker;
            System.out.println("Department: " + leader.getDepartment());
        } else if (worker instanceof Programmer) {
            Programmer programmer = (Programmer) worker;
            System.out.println("Programming Language: " + programmer.getProgrammingLanguage());
        }
    }
}
