/*
 * Copyright (c) 2016. Marek Berkan
 */
package pl.mberkan.oca.part3;

import java.util.Arrays;

/**
 * - sort
 * - binary search:
 *   - only sorted (unexpected result when not sorted)
 *   - when found -> index of match
 *   - when not found -> "negative value showing _one smaller_ than the negative of index, where a match needs to be
 *     inserted to preserver sorted order"
 */
public class EArraySortingAndSearch {
    public static void main(String[] args) {

        int[] numbers = { 6, 9, 1};
        Arrays.sort(numbers);
        for(int i : numbers) {
            System.out.println(i);
        }
        System.out.println();
//
//        String[] strings = { "10", "9", "100"};
//        Arrays.sort(strings);
//        for(String s : strings) {
//            System.out.println(s);
//        }
//        System.out.println();
//
//        int[] numbers2 = { 2, 4, 6, 8};
//        System.out.println(Arrays.binarySearch(numbers2, 2));
//        System.out.println(Arrays.binarySearch(numbers2, 4));
//        System.out.println(Arrays.binarySearch(numbers2, 1));
//        System.out.println(Arrays.binarySearch(numbers2, 3));
//        System.out.println(Arrays.binarySearch(numbers2, 9));

    }
}
