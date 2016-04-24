/*
 * Copyright (c) 2016. Marek Berkan
 */

package pl.mberkan.oca.part5;

/**
 * Static Interface Methods were introduced in Java 8.
 *
 * Static Interface Methods:
 * - assumed to be public
 * - to reference to static method, a reference to the name of the interface must be used
 */
public class IStaticInterfaceMethods implements SampleInterfaceWithStaticMethod {

    void printValue() {
//        System.out.println(getValue());
//        System.out.println(this.getValue());
        System.out.println(SampleInterfaceWithStaticMethod.getValue());
    }
}

interface SampleInterfaceWithStaticMethod {
    static int getValue() {
        return 11;
    }
}
