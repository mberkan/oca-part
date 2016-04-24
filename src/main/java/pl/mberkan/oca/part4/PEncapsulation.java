/*
 * Copyright (c) 2016. Marek Berkan
 */
package pl.mberkan.oca.part4;

/**
 * Encapsulation and JavaBeans naming convention.
 */
public class PEncapsulation {

    // properties are private
    private int numEggs;
    private boolean happy;

    // getter begin from "is" for boolean
    public boolean isHappy() {
        return happy;
    }


    // getter begin from "get" for not-boolean
    public int getNumEggs() {
        return numEggs;
    }

    // setter begin from "set" plus name of property with first letter upper case
    public void setNumEggs(int numEggs) {
        this.numEggs = numEggs;
    }

    public void setHappy(boolean happy) {
        this.happy = happy;
    }
}
