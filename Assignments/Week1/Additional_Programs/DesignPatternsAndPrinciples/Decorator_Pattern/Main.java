package Assignments.Week1.Additional_Programs.DesignPatternsAndPrinciples.Decorator_Pattern;

public class Main {
    public static void main(String[] args) {
        Notifier n1 = new EmailNotifier();
        n1.send();

        Notifier n2 = new SMSNotifier(new EmailNotifier());
        n2.send();
    }
}
