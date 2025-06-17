package Assignments.Week1.DesignPatternsAndPrinciples.FactoryMethodPatternExample;


public class PdfDocFactory extends DocumentFactory{
    @Override
    public Document createDocument(){
        return new PdfDocument();
    }
}
