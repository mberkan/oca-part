/*
 * Copyright (c) 2016. Marek Berkan
 */

package pl.mberkan.oca.part5;

/**
 * An abstract class:
 * - *may* contains abstract methods
 * - can't be final
 * - can't be private (?)
 * - can't be instantiate
 *
 * Abstract method:
 * - may exists in abstract class only!
 * - must be marked as abstract
 * - can't contain body
 * - can't be final
 * - can't be private
 *
 * The first concrete class that extends an abstract class must provide an implementation for all abstract methods
 */
public abstract class FAbstractClass {

    abstract void foo();

//        void foo();
//        abstract void foo() {}

//        final abstract void foo();
//        private abstract void foo();

    public static void main(String[] args) {
//        new FAbstractClass();
        new AbstractClass3();
    }

}

abstract class AbstractClass2 extends FAbstractClass {

}

class AbstractClass3 extends AbstractClass2 {
    @Override
    void foo() {
        // body!
    }
}


