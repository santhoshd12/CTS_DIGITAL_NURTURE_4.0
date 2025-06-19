package Assignments.Week1.DesignPatternsAndPrinciples.Ex2_FactoryMethodPatternExample;


public class PdfDocFactory extends DocumentFactory{
    @Override
    public Document createDocument(){
        return new PdfDocument();
    }
}
