package Assignments.Week1.Additional_Programs.DataStructuresandAlgorithm.Ex5_TaskManagementSystem;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(1, "Write report", "Pending");
        manager.addTask(2, "Fix bugs", "In Progress");
        manager.addTask(3, "Team meeting", "Done");

        System.out.println("All tasks:");
        manager.showAllTasks();

        System.out.println("\nSearch for task ID 2:");
        manager.searchTask(2);

        System.out.println("\nDelete task ID 1:");
        manager.deleteTask(1);

        System.out.println("\nAll tasks after deletion:");
        manager.showAllTasks();
    }
}
