package Assignments.Week1.Additional_Programs.DesignPatternsAndPrinciples.Builder_Pattern;

public class Main {
    public static void main(String[] args) {
        Computer myComputer = new Computer.Builder()
                .setCpu("Intel i5")
                .setRam("8GB")
                .setStorage("512GB SSD")
                .build();

        myComputer.showSpecs();
    }
}
