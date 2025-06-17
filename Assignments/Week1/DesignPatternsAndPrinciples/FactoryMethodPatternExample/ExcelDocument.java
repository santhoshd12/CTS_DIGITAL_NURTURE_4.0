package Assignments.Week1.DesignPatternsAndPrinciples.FactoryMethodPatternExample;


public class ExcelDocument implements Document{
    public void open(){
        System.out.println("Excel Document opened.");
    }
    
    public void close(){
        System.out.println("Excel Document closed.");
    }
}
