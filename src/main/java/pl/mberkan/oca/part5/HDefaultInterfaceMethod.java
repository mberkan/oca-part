/*
 * Copyright (c) 2016. Marek Berkan
 */

package pl.mberkan.oca.part5;

/**
 * Default interface methods were introduced in Java 8.
 *
 * Default method:
 * - may be declared within an interface (not class nor abstract class)
 * - must be marked with "default" keyword
 * - is not static, is not final, is not abstract (may be overridden)
 * - assumed to be public (can't be private nor package)
 *
 * When an class implements two interfaces with the same default method then code will not compile -> we must deliver
 * own implementation.
 */
public class HDefaultInterfaceMethod implements SampleInterfaceWithDefaultMethod
        // , AnotherInterfaceWithDefaultMethod
{
    @Override
    public int standardAbstractMethod() {
        return 0;
    }

    public static void main(String[] args) {
        SampleInterfaceWithDefaultMethod d = new HDefaultInterfaceMethod();
        System.out.println(d.standardAbstractMethod() + ", " + d.defaultMethod());
    }
}

interface SampleInterfaceWithDefaultMethod {

    int standardAbstractMethod();

    default int defaultMethod() {
        return 1;
    }
}

interface AnotherInterfaceWithDefaultMethod {

    default int defaultMethod() {
        return 3;
    }
}
