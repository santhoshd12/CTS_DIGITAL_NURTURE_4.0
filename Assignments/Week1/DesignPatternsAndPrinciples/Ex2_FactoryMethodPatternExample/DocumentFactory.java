package Assignments.Week1.DesignPatternsAndPrinciples.Ex2_FactoryMethodPatternExample;

public abstract class DocumentFactory {
    public abstract Document createDocument();
}

class WordDocFactory extends DocumentFactory {
    @Override
    public Document createDocument(){
        return new WordDocument();
    }
}

class PdfDocFactory extends DocumentFactory{
    @Override
    public Document createDocument(){
        return new PdfDocument();
    }
}

class ExcelDocFactory extends DocumentFactory{

    @Override
    public Document createDocument(){
        return new ExcelDocument();
    }
}