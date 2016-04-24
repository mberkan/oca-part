/*
 * Copyright (c) 2016. Marek Berkan
 */
package pl.mberkan.oca.part3;

/**
 * - What is String pool?
 */
public class AStringPool {

    public static void main(String[] args) {

        String original = "XXX";

        String test1 = "XXX";
        String test2 = new String("XXX");
        String test3 = "X".concat("XX");

        System.out.println(original == test1);
        System.out.println(original == test2);
        System.out.println(original == test3);
    }
}
