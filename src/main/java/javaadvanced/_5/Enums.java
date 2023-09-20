package javaadvanced._5;

public class Enums {
    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
        exerciseThree();
    }

    private static void exerciseOne() {
        System.out.println("\nExercise 1: ");
        enum Weekdays {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }

        for (Weekdays val: Weekdays.values()) {
            System.out.println(val);
        }
    }

    enum Seasons { WINTER, SUMMER, SPRING, AUTUMN}
    private static void exerciseTwo() {
        System.out.println("\nExercise 1: ");

        Seasons thisSeason = Seasons.AUTUMN;
        System.out.println(seasonsDateRange(thisSeason));
    }

    private static String seasonsDateRange(Seasons season){
        switch (season){
            case AUTUMN:
                return "Date range: Jan - March";
            case SPRING:
                return "Date range: April - Aug";
            case SUMMER:
                return "Date range: Sept - Oct";
            case WINTER:
                return "Date range: Nov - Dec";
        }
        return null;
    }

    enum TrafficLights {RED, AMBER, GREEN}
    private static void exerciseThree() {
        System.out.println("\nExercise 3: ");

        TrafficLights light = TrafficLights.AMBER;
        System.out.println(simulateTrafficLights(light));
    }

    private static String simulateTrafficLights(TrafficLights light){
        switch (light){
            case RED:
                return "Current light:" +light+ " Next Light: " + TrafficLights.AMBER;
            case AMBER:
                return "Current light:" +light+ " Next Light: " + TrafficLights.GREEN;
            case GREEN:
                return "Current light:" +light+ " Next Light: " + TrafficLights.RED;
        }
        return null;
    }
}
