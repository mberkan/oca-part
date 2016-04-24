/*
 * Copyright (c) 2016. Marek Berkan
 */
package pl.mberkan.oca.part3;

/**
 * - Xxx.parseXxx -> to primitive
 * - Xxx.valueOf -> to wrapper
 */
public class HWrapperClasses {
    public static void main(String[] args) {
        int primitive = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf("123");
    }
}
