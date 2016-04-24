/*
 * Copyright (c) 2016. Marek Berkan
 */
package pl.mberkan.oca.part1;

/**
 * - references vs. objects
 * - use paper and pencil :-)
 */
public class LDestroyingObjects {
    public static void main(String[] args) {
        String one, two;
        one = new String("A");
        two = new String("B");
        one = two;
        String three = one;
        one = null;
    }
}
