/*
 * Copyright (c) 2016. Marek Berkan
 */
package pl.mberkan.oca.part2;

/**
 * Promotion rules:
 * 1. to the larger of the two data types,
 * 2. if one is floating then to the floating point data type,
 * 3. when binary arithmetic operator, then byte, short, char to int data type
 */
public class BNumericPromotionRules {

    void test1() {
        int x = 1;
        long y = 2;
        long result = x + y; // not int!
    }

    void test2() {
        float x = 1.1f;
        double y = 2.2;
        double result = x + y; // not float!
    }

    void test3() {
        float x = 1.1f;
        int y = 2;
        float result = x + y; // not int!
    }

    void test4() {
        short x = 10;
        short y = 3;
        int result = x/y; // not short!
    }
}
