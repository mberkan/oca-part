/*
 * Copyright (c) 2016. Marek Berkan
 */
package pl.mberkan.oca.part3;

import java.time.LocalDate;
import java.time.Period;

/**
 * Periods
 */
public class LPeriods {
    public static void main(String[] args) {

        LocalDate date  = LocalDate.of(2016, 4, 12);
        Period period = Period.ofDays(4);
        System.out.println(period);

        date = date.plus(period);
        System.out.println(date);

        // perios doesn't chain!
//        Period wrong = Period.ofYears(3).ofWeeks(1);
//        System.out.println(wrong);
//
//        // period doesn't work on time
//        LocalTime time = LocalTime.of(22, 33, 00);
//        time.minus(period); // -> UnsupportedTemporalTypeException
    }
}
