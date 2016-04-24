/*
 * Copyright (c) 2016. Marek Berkan
 */
package pl.mberkan.oca.part2;

/**
 * Nested loop example
 */
public class ONestedLoops {
    public static void main(String[] args) {
        int x = 20;
        while(x > 0) {
            do {
                x -= 2;
            } while (x > 5);
            x--;
            System.out.println(x);
        }
    }
}
