package javabasics._11;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nExercise 1: ");
        exerciseOne("Java runs on 2 billion devices", 15);
        exerciseOne("+31 2 58765446", 48);
        exerciseOne("hello world", 42);

        System.out.println("\nExercise 2: ");
        exerciseTwo("sandwich", 2.5, 12.5);
        exerciseTwo("soup", 10, 30);
        exerciseTwo("soup", 1, 5);
    }

    public static double exerciseOne(String text, double expectedScore) {
        double yourScore = text.length();

        if(yourScore>20){
            yourScore = 20;
        }

        if(text.contains("a")){
            yourScore -= 5;
        }

        if(text.toLowerCase().equals(text)){
            yourScore += 10;
        }

        if(yourScore>20){
            yourScore *= 2;
        }

        System.out.printf("Expected score=%f,  actual score=%f", expectedScore, yourScore);
        if (expectedScore != yourScore) {
            System.out.printf(" -Failed: Wrong score for '%s' %n", text);
        } else {
            System.out.println(" -Success!");
        }

        return yourScore;

    }

    private static double exerciseTwo(String mealType, double weight, double expectedScore) {

        double yourMealScore = 0;

        switch (mealType){
            case "sandwich" -> yourMealScore = 5*weight;
            case "soup" -> yourMealScore = 3*weight;
        }

        if(yourMealScore<5) yourMealScore = 5;

        System.out.printf("Expected score=%f,  actual score=%f", expectedScore, yourMealScore);
        if (expectedScore != yourMealScore) {
            System.out.printf(" -Failed: Wrong score for '%s' %n", mealType);
        } else {
            System.out.println(" -Success!");
        }

        return yourMealScore;
    }

}
