package Assignments.Week1.Additional_Programs.DesignPatternsAndPrinciples.Ex5_Decorator_Pattern;


public class NotifierDecorator implements Notifier {
    protected Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    public void send() {
        notifier.send();
    }
}
