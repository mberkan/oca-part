/*
 * Copyright (c) 2016. Marek Berkan
 */

package pl.mberkan.oca.part5;

/**
 * Interface:
 * - is public (assumed)
 * - is abstract (assumed)
 * - can't be final
 * - may has methods
 * - can't be instantiate
 * - may extends another interface(s)!
 * - can't extend class (!)
 *
 * Method (non-static, non-default):
 * - is public (assumed)
 * - is abstract (assumed)
 *
 * Variables:
 * - is public (assumed)
 * - is static (assumed)
 * - is final (assumed)
 */

public class GInterfaces implements ComplexInterface {

    @Override
    public int getValue() {
        return 0;
    }

    @Override
    public int getSize() {
        return 0;
    }

    public static void main(String[] args) {
        // new SampleInterface();
        new GInterfaces();
    }
}

// private, static <-- not allowed
abstract interface SampleInterface  {

    public static final int VALUE = 1;

    public abstract int getValue();
}

interface AnotherInterface {
    int getSize();
}

interface ComplexInterface extends SampleInterface, AnotherInterface {}

