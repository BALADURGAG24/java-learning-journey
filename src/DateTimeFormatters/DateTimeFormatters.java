package DateTimeFormatters;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatters {
    public static void main(String[] args){

        LocalDate date1 = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime1 = LocalDateTime.now();
        Instant instant = Instant.now();

        System.out.println(date1);
        System.out.println();

        System.out.println(time);
        System.out.println();

        System.out.println(dateTime1);
        System.out.println();

        System.out.println(instant);
        System.out.println();

        LocalDateTime dateTime2 = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String newDateTime = dateTime2.format(formatter);
        System.out.println(newDateTime);
        System.out.println();

        LocalDate date2 = LocalDate.of(2024, 12, 25);
        System.out.println(date2);
        System.out.println();

        LocalDateTime date3 = LocalDateTime.of(2026, 1, 1, 0, 0, 0);
        System.out.println(date3);
        System.out.println();

        LocalDateTime date4 = LocalDateTime.of(2025, 1, 1, 0, 0, 0);
        System.out.println(date4);
        System.out.println();

        if(date3.isBefore(date4)){
            System.out.println(date3 + " is earlier than " + date4);
        }else if(date3.isAfter(date4)){
            System.out.println(date3 + " is later than " + date4);
        }else if(date3.isEqual(date4)){
            System.out.println(date3 + " is equal to " + date4);
        }

    }
}
