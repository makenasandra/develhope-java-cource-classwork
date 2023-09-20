package javabasics.DateTime;

//calculate and print:
//        using LocaleDateTime, the current date and time in the following format: DayNumber FullMonthName Last2DigitsOfYearNumber HourTime MinuteTime
//        using ZonedDateTime, the current date and time in ISO Zoned Date Time format


import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        Date today = new Date();
        LocalDateTime currentDateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yy-hh-mm");
        System.out.println("The current date and time: " +  currentDateTime.format(formatter));
        System.out.println("The current date and time in ISO Zoned Date Time format: "
                + ZonedDateTime.now());

    }
}
