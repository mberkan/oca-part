/*
 * Copyright (c) 2016. Marek Berkan
 */
package pl.mberkan.oca.part4;

/**
 * Order is:
 * - exact match
 * - larger primitive type
 * - autoboxed type
 * - varargs
 * 
 * Overloading is compile-time
 * Overriding is execution-time
 */
public class MOverloadingOrder {

     public static void glide(int i, int j) {
        System.out.println("1");
    }

    public static void glide(long i, long j) {
        System.out.println("2");
    }

    public static void glide(Integer i, Integer j) {
        System.out.println("3");
    }

    public static void glide(int... args) {
        System.out.println("4");
    }

    public static void overloadenMethod(ParentClass p) {
        System.out.println("Method with parent class argument");
    }
    public static void overloadenMethod(ChildClass c) {
        System.out.println("Method with child class argument");
    }

    public static void main(String[] args) {
        glide(1, 2);

        ParentClass parentClassRef = new ChildClass();
        overloadenMethod(parentClassRef); // overloadenMethod(ParentClass) will be called
        parentClassRef.overridenMethod(); // overridenMethod from ChildClass will be called

        ChildClass childClassRef = new ChildClass();
        overloadenMethod(childClassRef); // overloadenMethod(ChildClass) will be called
        childClassRef.overridenMethod(); // overridenMethod from ChildClass will be called


    }
}

class ParentClass {
    public void overridenMethod() {
        System.out.println("Override parentClass method");
    }
};
class ChildClass extends ParentClass {
    @Override
    public void overridenMethod() {
        System.out.println("Override childClass method");
    }
};
