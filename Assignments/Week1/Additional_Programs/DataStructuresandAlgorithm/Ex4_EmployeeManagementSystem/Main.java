package Assignments.Week1.Additional_Programs.DataStructuresandAlgorithm.Ex4_EmployeeManagementSystem;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        manager.addEmployee(new Employee(1, "emp1", "Manager", 50000));
        manager.addEmployee(new Employee(2, "emp2", "Developer", 40000));

        System.out.println("All Employees:");
        manager.showAllEmployees();

        System.out.println("\nSearch Employee with ID 2:");
        manager.searchEmployee(2);

        System.out.println("\nDelete Employee with ID 1:");
        manager.deleteEmployee(1);

        System.out.println("\nAll Employees after deletion:");
        manager.showAllEmployees();
    }
}
