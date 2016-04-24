/*
 * Copyright (c) 2016. Marek Berkan
 */
package pl.mberkan.oca.part4.anotherpackage;

import pl.mberkan.oca.part4.BAccessModifiers;

/**
 * Access from class extending base one from another package.
 */
public class EAccessModifiersExtends extends BAccessModifiers {
    public static void main(String[] args) {
        BAccessModifiers test = new EAccessModifiersExtends();
//        System.out.println(test.name);
//        System.out.println(test.hasFur);
//        System.out.println(test.hasPaws);
//        System.out.println(test.id);
    }
}
