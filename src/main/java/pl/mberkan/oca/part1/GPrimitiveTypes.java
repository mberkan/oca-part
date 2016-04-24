/*
 * Copyright (c) 2016. Marek Berkan
 */
package pl.mberkan.oca.part1;

/**
 * - example of primitive types
 * - converting
 */
public class GPrimitiveTypes {

    boolean aBoolean = true; // true/false

    byte aByte = 123; // 8-bit

    short aShort = 123; // 16-bit

    int anInt = 123; // 32-bit

    long aLong = 123; // 64-bit

    float aFloat = 123.45f; // 32-bit

    double aDouble = 123.45; // 64-bit

    char aChar = 'a'; // 16-bit (Unicode)

    ////////////////////////////////////////////

    void test() {
        int i = aByte;
        i = aShort;
        i = anInt;
        // i = 9L; // boxing expected
        i = aChar;

        double d = 5;
        d = aFloat;
        // aFloat = aDouble; // boxing expected
    }
}
