package Assignments.Week1.DesignPatternsAndPrinciples.Ex2_FactoryMethodPatternExample;


public class WordDocFactory extends DocumentFactory {
    @Override
    public Document createDocument(){
        return new WordDocument();
    }
}
