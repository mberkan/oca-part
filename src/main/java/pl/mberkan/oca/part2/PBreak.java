/*
 * Copyright (c) 2016. Marek Berkan
 */
package pl.mberkan.oca.part2;

/**
 * "break" example
 */
public class PBreak {
    public static void main(String[] args) {

        OUTER_LOOP: for(int i = 1; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                if(j == 5) {
                    break;
                    // break OUTER_LOOP; // <-- with label
                }
                System.out.print(i + "x" + j + "\t");
            }
            System.out.println();
        }
    }
}
