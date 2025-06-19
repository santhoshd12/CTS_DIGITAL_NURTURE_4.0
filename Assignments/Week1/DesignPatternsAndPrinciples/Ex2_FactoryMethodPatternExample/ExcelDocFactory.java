package Assignments.Week1.DesignPatternsAndPrinciples.Ex2_FactoryMethodPatternExample;


class ExcelDocFactory extends DocumentFactory{

    @Override
    public Document createDocument(){
        return new ExcelDocument();
    }
}