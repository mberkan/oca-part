/*
 * Copyright (c) 2016. Marek Berkan
 */
package pl.mberkan.oca.part5;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 * Overriding rules:
 * 1. the same signature
 * 2. at least as accessible or more accessible than the method in parent class
 * 3. may not throw a checked exception that is new or broader
 * 4. must return the same class or its subclass ("covariant return type")
 */
public class BOverriding extends OverridingBase {

    static final Instant TODAY = LocalDate.of(2016, 4, 25).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
    static final Instant YEAR_AGO = LocalDate.of(2015, 4, 25).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();

    // private
    // public
    protected Date foo(String input)
//             throws Exception
//            throws FileNotFoundException
    {
        System.out.println("inherited foo");
        return Date.from(TODAY);
    }

    public static void main(String[] args) throws Exception {
        Date result = new BOverriding().foo("TEST");
        System.out.println("Result: " + result);
    }
}

class OverridingBase {

    protected Date foo(String input) throws IOException {
        System.out.println("Base foo");
        return Date.from(BOverriding.YEAR_AGO);
    }
}
