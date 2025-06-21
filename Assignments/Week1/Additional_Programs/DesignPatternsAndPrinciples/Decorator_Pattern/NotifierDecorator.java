package Assignments.Week1.Additional_Programs.DesignPatternsAndPrinciples.Decorator_Pattern;


public class NotifierDecorator implements Notifier {
    protected Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    public void send() {
        notifier.send();
    }
}
