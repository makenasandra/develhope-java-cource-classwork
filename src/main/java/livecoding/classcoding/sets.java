package livecoding.classcoding;

import java.util.*;

public class sets {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    private static void exercise4() {
        Set<String> weekDays = new HashSet<>(Set.of("Monday", "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"));

        Set<String> daysOfTheWeek = new LinkedHashSet<>(Set.of("Monday", "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"));

        System.out.println(weekDays);
        System.out.println(daysOfTheWeek);
        System.out.println("Is the first Set equal to the second one? " + weekDays.equals(daysOfTheWeek));

    }

    private static void exercise3() {
        Set<Integer> numSet = Set.of(1,2,3,4,5,6,7,12,8,9,10);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (Integer num:
             numSet) {
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
        }
        System.out.println("Max: " + max + "  Min: " + min);
    }

    private static void exercise2() {
        Set<String> fruitSet = new HashSet<>();

        fruitSet.add("apple");
        fruitSet.add("banana");
        fruitSet.add("orange");
        fruitSet.add("kiwi");
        fruitSet.add("mango");

        List<String> fruitList = List.of("apple", "banana", "orange");

        fruitSet.addAll(fruitList);
        System.out.println(fruitSet);
    }

    private static void exercise1() {
        Set<Integer> ourSet = new HashSet<>();

        ourSet.add(1);
        ourSet.add(1);
        ourSet.add(5);
        ourSet.add(2);
        ourSet.add(1);
        System.out.println(ourSet);

        ourSet.remove(1);

        System.out.println(ourSet);
    }




}
