package javabasics._14;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();

    }

    private static void  exerciseOne() {
        System.out.println("\nExercise 1: ");
        int bankBalance = 500;
        long questionableFunds = 5_000_000_000L;
        long newBankBalance = Long.valueOf(bankBalance);

        System.out.println("Latest Bank balance: " + (newBankBalance += questionableFunds));
    }

    private static void  exerciseTwo() {
        System.out.println("\nExercise 2: ");

        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getDayOfYear());
        System.out.println(now.getMonth());
        System.out.println(now.getMonthValue());
        System.out.println(now.isBefore(LocalDate.of(2021, Month.APRIL, 23)));
        System.out.println(now.isAfter(LocalDate.of(2021, Month.APRIL, 23)));

    }
}
