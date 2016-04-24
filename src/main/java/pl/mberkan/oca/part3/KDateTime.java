/*
 * Copyright (c) 2016. Marek Berkan
 */
package pl.mberkan.oca.part3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * Classes:
 * - LocalDate - only date, without TZ
 * - LocalTime - only time, without TZ
 * - LocalDateTime - date and time, without TZ
 *
 * Immutable!
 * Month counted from "1"
 */
public class KDateTime {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate date1 = LocalDate.of(2016, Month.APRIL, 12);
        LocalDate date2 = LocalDate.of(2016, 4, 12); // "4" -> april!

        LocalTime time1 = LocalTime.of(22, 30);
        LocalTime time2 = LocalTime.of(22, 30, 22);
        LocalTime time3 = LocalTime.of(22, 30, 22, 99);

        LocalDateTime dateTime1 = LocalDateTime.of(2016, Month.APRIL, 12, 22, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(2016, Month.APRIL, 12, 22, 30, 11);
        LocalDateTime dateTime3 = LocalDateTime.of(2016, Month.APRIL, 12, 22, 30, 11, 100);

//        LocalDate date3 = new LocalDate(); // --> dosn't compile

//        LocalDate date4 = LocalDate.of(2016, 4, 33); // --> DateTimeException

        // manipulating
        LocalDate newDate = date1.plusDays(2);
        newDate = newDate.plusWeeks(2);

        // chaining
        newDate = date1
                .plusDays(2)
                .plusWeeks(2);

//        date1.plusHours(3);
//        time1.plusMonths(3);
    }
}
