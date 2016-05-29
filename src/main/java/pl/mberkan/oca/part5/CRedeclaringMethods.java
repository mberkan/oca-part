/*
 * Copyright (c) 2016. Marek Berkan
 */
package pl.mberkan.oca.part5;

/**
 * Private method is redeclared, not inherited! (can be hidden and overloaden as static method but not overriden)
 */
public class CRedeclaringMethods extends RedeclaringMethodsBase {

    // @Override // compiler error
    private String foo(String input) {
        return "Redeclated foo";
    }

    public CRedeclaringMethods() {
        System.out.println("Child constructor: " + foo("Test"));
    }

    public static void main(String[] args) {
        String result = new CRedeclaringMethods().foo("Test");
        System.out.println("Result: " + result);
        
        // RedeclaringMethodsBase childClassWithParentRef = new CRedeclaringMethods();
        // result = childClassWithParentRef.foo("Test"); // compiler error
    }
}

class RedeclaringMethodsBase {
    private String foo(String input) {
        return "Base foo";
    }

    public RedeclaringMethodsBase() {
        System.out.println("Base constructor: " + foo("Test"));
    }
}
