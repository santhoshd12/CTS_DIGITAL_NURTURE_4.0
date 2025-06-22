package Assignments.Week1.Additional_Programs.DataStructuresandAlgorithm.Ex4_EmployeeManagementSystem;

public class EmployeeManager {
    Employee[] employees = new Employee[100]; // max 100 employees
    int count = 0;

    public void addEmployee(Employee e) {
        if (count < employees.length) {
            employees[count++] = e;
        } else {
            System.out.println("Array full, can't add more employees.");
        }
    }

    public void searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                employees[i].display();
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void showAllEmployees() {
        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                // shift elements left
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                count--;
                System.out.println("Employee deleted.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}
