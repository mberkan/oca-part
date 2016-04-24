/*
 * Copyright (c) 2016. Marek Berkan
 */

package pl.mberkan.oca.part5;

/**
 * Hiding static methods rules:
 * 1. the same signature
 * 2. at least as accessible or more accessible than the method in parent class
 * 3. may not throw a checked exception that is new or broader
 * 4. must return the same class or its subclass ("covariant return type")
 * 5. static and not static methods can't be mixed!
 */
public class DHidingStaticMethods extends HidingStaticMethodsBase {

    static void eat() {
        System.out.println("Child eat!");
    }

    public static void main(String[] args) {
        DHidingStaticMethods.eat();
        HidingStaticMethodsBase.eat();

        new HidingStaticMethodsBase();
    }
}

class HidingStaticMethodsBase {
    static void eat() {
        System.out.println("Base eat!");
    }

    public HidingStaticMethodsBase() {
        System.out.print("Base constructor: ");
        eat();
        System.out.println();
    }
}