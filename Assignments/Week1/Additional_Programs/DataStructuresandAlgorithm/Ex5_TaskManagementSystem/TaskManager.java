package Assignments.Week1.Additional_Programs.DataStructuresandAlgorithm.Ex5_TaskManagementSystem;

public class TaskManager {
    Task head = null;

    // Add task to the end
    public void addTask(int id, String name, String status) {
        Task newTask = new Task(id, name, status);
        if (head == null) {
            head = newTask;
        } else {
            Task current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTask;
        }
    }

    // Search task by ID
    public void searchTask(int id) {
        Task current = head;
        while (current != null) {
            if (current.taskId == id) {
                current.display();
                return;
            }
            current = current.next;
        }
        System.out.println("Task not found.");
    }

    // Traverse all tasks
    public void showAllTasks() {
        Task current = head;
        while (current != null) {
            current.display();
            current = current.next;
        }
    }

    // Delete task by ID
    public void deleteTask(int id) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.taskId == id) {
            head = head.next;
            System.out.println("Task deleted.");
            return;
        }

        Task current = head;
        while (current.next != null) {
            if (current.next.taskId == id) {
                current.next = current.next.next;
                System.out.println("Task deleted.");
                return;
            }
            current = current.next;
        }

        System.out.println("Task not found.");
    }
}

