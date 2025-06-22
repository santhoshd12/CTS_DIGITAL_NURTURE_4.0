package Assignments.Week1.Additional_Programs.DesignPatternsAndPrinciples.Ex5_Decorator_Pattern;

interface Notifier {
    void send();
}


public class EmailNotifier implements Notifier {
    public void send() {
        System.out.println("Email sent");
    }
}