/*
 * Copyright (c) 2016. Marek Berkan
 */
package pl.mberkan.oca.part2;

/**
 * - Example in one line
 */
public class CIncrementDecrement {
    public static void main(String[] args) {

        int x = 3;
        int y = ++x * 5 / x-- + --x;

        System.out.println("x is " + x);
        System.out.println("y is " + y);

//        test();
    }

    // int y = ++x * 5 / x-- + --x;
    // int y = 4 * 5 / x-- + --x; // -> x = 4
    // int y = 4 * 5 / 4 + --x; // -> x = 3
    // int y = 4 * 5 / 4 + 2; // -> x = 2

    static void test() {
        int i = 10;
        i = i++; // <-- how it works?
        System.out.println(i);
    }
}
