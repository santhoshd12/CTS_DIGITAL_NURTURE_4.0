package Assignments.Week1.Additional_Programs.DataStructuresandAlgorithm.Ex4_EmployeeManagementSystem;

public class Employee {
    int employeeId;
    String name;
    String position;
    double salary;

    public Employee(int id, String name, String position, double salary) {
        this.employeeId = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void display() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Position: " + position + ", Salary: " + salary);
    }
}
