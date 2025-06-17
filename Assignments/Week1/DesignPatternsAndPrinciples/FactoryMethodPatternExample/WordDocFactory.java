package Assignments.Week1.DesignPatternsAndPrinciples.FactoryMethodPatternExample;


public class WordDocFactory extends DocumentFactory {
    @Override
    public Document createDocument(){
        return new WordDocument();
    }
}
