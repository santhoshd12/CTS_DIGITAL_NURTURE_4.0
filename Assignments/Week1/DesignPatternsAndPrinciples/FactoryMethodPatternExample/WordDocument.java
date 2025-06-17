package Assignments.Week1.DesignPatternsAndPrinciples.FactoryMethodPatternExample;


public class WordDocument implements Document {
    public void open(){
        System.out.println("Word Document opened.");
    }
    public void close(){
        System.out.println("Word Document closed.");
    }
}
