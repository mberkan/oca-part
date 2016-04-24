/*
 * Copyright (c) 2016. Marek Berkan
 */
package pl.mberkan.oca.part2;

/**
 * Created by mberkan on 05.04.16.
 */
public class RContinue {
    public static void main(String[] args) {

        OUTER_LOOP: for(int i = 1; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                if(j == 5) {
                    continue ;
//                    continue OUTER_LOOP; // <-- with label
                }
                System.out.print(i + "x" + j + "\t");
            }
            System.out.println();
        }
    }

}
