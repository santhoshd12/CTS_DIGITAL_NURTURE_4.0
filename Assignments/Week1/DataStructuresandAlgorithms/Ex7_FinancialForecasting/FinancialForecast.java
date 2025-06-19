package Assignments.Week1.DataStructuresandAlgorithms.Ex7_FinancialForecasting;

public class FinancialForecast {

    public static double futureValueRecursive(double principal, double rate, int years) {
        if (years == 0) {
            return principal;
        }

        return futureValueRecursive(principal, rate, years - 1) * (1 + rate);
    }

    public static double futureValueIterative(double principal, double rate, int years) {
        for (int i = 0; i < years; i++) {
            principal *= (1 + rate);
        }
        return principal;
    }

    public static void main(String[] args) {
        double initialInvestment = 10000.0; 
        double annualGrowthRate = 0.05; 
        int years = 5; 

        double futureValueRec = futureValueRecursive(initialInvestment, annualGrowthRate, years);
        System.out.printf("Future Value (Recursive): %.2f\n", futureValueRec);

        double futureValueItr = futureValueIterative(initialInvestment, annualGrowthRate, years);
        System.out.printf("Future Value (Iterative): %.2f\n", futureValueItr);
    }
}
