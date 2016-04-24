/*
 * Copyright (c) 2016. Marek Berkan
 */
package pl.mberkan.oca.part3;

/**
 * Arrays
 */
public class DArrays {
    public static void main(String[] args) {

        // inicialization
        int[] numbers1 = new int[3];
        int[] numbers2 = new int[] { 1, 2, 3 };

        // declarations
        int [] numbers3;
        int numbers4[];
        int numbers5 [];

        // mixed declarations
        int ids1[], ids2;
        int[] ids3, ids4;

        // casting
        String[] animals = {"animals"};
        Object[] things = animals;
        // animals = things; // -> casting required

        // wrong type
        // animals[0] = new StringBuilder("AAA"); // -> not match
        // animals[0] = new StringBuilder("AAA"); // -> not match
    }
}
