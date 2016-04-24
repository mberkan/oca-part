/*
 * Copyright (c) 2016. Marek Berkan
 */
package pl.mberkan.oca.part3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * Formatting
 */
public class MDateTimeFormatting {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2016, Month.APRIL, 12);
        LocalTime time3 = LocalTime.of(22, 30, 22, 99);
        LocalDateTime dateTime3 = LocalDateTime.of(2016, Month.APRIL, 12, 22, 30, 11, 100);

        System.out.println(date1);
        System.out.println(time3);
        System.out.println(dateTime3);
        System.out.println();

        System.out.println(date1.format(DateTimeFormatter.ISO_DATE));
        //System.out.println(time3.format(DateTimeFormatter.ISO_DATE));
        System.out.println(dateTime3.format(DateTimeFormatter.ISO_DATE));
        System.out.println();

        System.out.println(dateTime3.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm")));
    }
}
