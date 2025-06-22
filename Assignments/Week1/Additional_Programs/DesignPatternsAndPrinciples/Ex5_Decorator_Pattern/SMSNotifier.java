package Assignments.Week1.Additional_Programs.DesignPatternsAndPrinciples.Ex5_Decorator_Pattern;


public class SMSNotifier extends NotifierDecorator {
    public SMSNotifier(Notifier notifier) {
        super(notifier);
    }

    public void send() {
        super.send();
        System.out.println("SMS sent");
    }
}

