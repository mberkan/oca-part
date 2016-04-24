/*
 * Copyright (c) 2016. Marek Berkan
 */

package pl.mberkan.oca.part5;

/**
 * Variables are hidden, not overridden.
 */
public class EHidingVariables extends HidingVariablesBase {
    protected int i = 3;

    public EHidingVariables() {
        System.out.println("Child constructor: " + i);
        System.out.println("Child constructor (super): " + super.i);
    }

    public static void main(String[] args) {
        new EHidingVariables();
    }
}

class HidingVariablesBase {
    protected int i = 1;

    public HidingVariablesBase() {
        System.out.println("Base constructor: " + i);
    }
}
