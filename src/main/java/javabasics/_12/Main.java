package javabasics._12;

public class Main {
    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
    }

    private static void  exerciseOne() {
        System.out.println("\nExercise 1: ");
        String fastFoodOrder = "hamburger";
        double orderCost = 0;
        int orderCalories = 0;
    }

    private static void  exerciseTwo() {
        System.out.println("\nExercise 2: ");

        double currentInvestmentVal = 10_000;
        double averageReturnFromStockPercentage =  8;
        double perYearMultiplier = 1 + (averageReturnFromStockPercentage/100);
        int yearsPast = 0;
        double interestGainedThisYearEuros = 0;

        while(yearsPast <= 5 || currentInvestmentVal <= 15_000){
            System.out.println("Investment value =" + currentInvestmentVal + " after " + yearsPast++ +"years"+",interest this year" + interestGainedThisYearEuros);
            double previousYearsInvestment = currentInvestmentVal;
            currentInvestmentVal *= perYearMultiplier;
            interestGainedThisYearEuros = currentInvestmentVal -previousYearsInvestment;
        }
    }
}
