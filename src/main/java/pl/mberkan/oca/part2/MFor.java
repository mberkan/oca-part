/*
 * Copyright (c) 2016. Marek Berkan
 */
package pl.mberkan.oca.part2;

/**
 * "for" example
 * - multiple declaration, multiple increment
 * - can't redeclare
 * - can't use incompatible types
 * - can't use variables outside loop
 */
public class MFor {
    public static void main(String[] args) {
        int x = 0;
        for(long y = 1, z = 4; x < 5 && y < 10; x++, y++) {
//        for(long y = 1, z = 4, x = 3; x < 5 && y < 10; x++, y++) { // <-- redecare
//        for(long y = 1, z = 4, int f = 3; x < 5 && y < 10; x++, y++) { <-- incompatible type
            System.out.println("y: " + y);
        }
        System.out.println("x: " + x);
//        System.out.println("y: " + y); // <-- variable outside loop
    }
}
