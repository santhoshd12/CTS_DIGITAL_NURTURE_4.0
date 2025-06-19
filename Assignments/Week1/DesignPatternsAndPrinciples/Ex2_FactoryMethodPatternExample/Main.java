package Assignments.Week1.DesignPatternsAndPrinciples.Ex2_FactoryMethodPatternExample;


public class Main {
    public static void main(String[] args) {
        DocumentFactory wfact  = new WordDocFactory();   
        Document word = wfact.createDocument();
        word.open();

        DocumentFactory pfact = new PdfDocFactory();
        Document pdf = pfact.createDocument();
        pdf.open();

        DocumentFactory efact = new ExcelDocFactory();
        Document excel = efact.createDocument();
        excel.open();

        
        System.out.println("Closing all documents...");
        word.close();
        pdf.close();
        excel.close();
        
        
    }
}
