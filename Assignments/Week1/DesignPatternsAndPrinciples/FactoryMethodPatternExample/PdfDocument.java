package Assignments.Week1.DesignPatternsAndPrinciples.FactoryMethodPatternExample;


public class PdfDocument implements Document {
    public void open(){
        System.out.println("PDF Document opened.");
    }
    public void close(){
        System.out.println("PDF Document closed.");
    }
}
