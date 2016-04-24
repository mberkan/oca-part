/*
 * Copyright (c) 2016. Marek Berkan
 */
package pl.mberkan.oca.part5;

/**
 * Inheritance:
 * - each class inherits from java.lang.Object
 * - a compiler automatically insert a default constructor (if not defined)
 * - a compiler automatically insert "super()" (if not defined)
 * - "super" must be the first expression
 * - if a parent has not no-parameter constructor, then a child must explicitly call one of the existing
 */
public class AConstructors extends ConstructorsBase {

    public AConstructors() {
//        System.out.println("TEST"); // super must be the first expression
//        super(); //
        System.out.println("AConstructors");
    }

    public static void main(String[] args) {
        new AConstructors();
    }
}

class ConstructorsBase extends java.lang.Object {
    public ConstructorsBase() {
        System.out.println("Base 1 constructor");
    }
    public ConstructorsBase(int i) {
        System.out.println("Base 2 constructor");
    }
    public ConstructorsBase(String i) {
        System.out.println("Base 3 constructor");
    }
}
