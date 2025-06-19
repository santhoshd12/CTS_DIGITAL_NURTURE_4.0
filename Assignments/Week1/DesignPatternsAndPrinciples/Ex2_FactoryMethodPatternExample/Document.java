package Assignments.Week1.DesignPatternsAndPrinciples.Ex2_FactoryMethodPatternExample;

public interface Document {
    public void open();
    public void close();
    
}

class ExcelDocument implements Document{
    public void open(){
        System.out.println("Excel Document opened.");
    }
    
    public void close(){
        System.out.println("Excel Document closed.");
    }
}

class PdfDocument implements Document {
    public void open(){
        System.out.println("PDF Document opened.");
    }
    public void close(){
        System.out.println("PDF Document closed.");
    }
}

class WordDocument implements Document {
    public void open(){
        System.out.println("Word Document opened.");
    }
    public void close(){
        System.out.println("Word Document closed.");
    }
}
