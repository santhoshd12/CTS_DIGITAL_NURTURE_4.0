package Assignments.Week1.DesignPatternsAndPrinciples.FactoryMethodPatternExample;


class ExcelDocFactory extends DocumentFactory{

    @Override
    public Document createDocument(){
        return new ExcelDocument();
    }
}