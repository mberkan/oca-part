/*
 * Copyright (c) 2016. Marek Berkan
 */
package pl.mberkan.oca.part2;

/**
 * "while" example
 */
public class KWhile {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        while(x < 10) {
//        while x < 10 { // <-- doesn't compile
            y++;
        }
        System.out.println("y: " + y);
    }
}
