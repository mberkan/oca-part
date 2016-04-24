/*
 * Copyright (c) 2016. Marek Berkan
 */
package pl.mberkan.oca.part2;

import java.util.Arrays;
import java.util.List;

/**
 * foreach example:
 * - over array
 * - over collection
 */
public class NForeach {
    public static void main(String[] args) {

        String[] array =  {"A", "B", "C"};
        for (String tmp : array) {
            System.out.println(tmp);
        }

        List<String> list = Arrays.asList(new String[] {"E", "F", "G"});
        for (String tmp : list) {
            System.out.println(tmp);
        }
    }
}
