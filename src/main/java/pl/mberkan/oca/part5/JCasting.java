/*
 * Copyright (c) 2016. Marek Berkan
 */

package pl.mberkan.oca.part5;

/**
 * Casting rules:
 * - a subclass to superclass doesn't require an explicit cast
 * - a superclass to subclass requires an explicit cast
 * - the compiler will not allow cast to unrelated types
 * - exception may be thrown at runtime if object is not actually an instance of that class
 */
public class JCasting {
    public static void main(String[] args) {
        String s = "TEST";
        Object o = s;
        String s2 = (String)o;

        // StringBuffer sb = (StringBuffer)s;

        IndexOutOfBoundsException indexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
        RuntimeException runtimeException = indexOutOfBoundsException;
        NullPointerException nullPointerException = (NullPointerException)runtimeException;
    }
}
