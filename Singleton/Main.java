package Singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.print("First log");

        Logger logger2 = Logger.getInstance();
        logger2.print("Second log");

        System.out.println(logger1 == logger2);
    }
}
