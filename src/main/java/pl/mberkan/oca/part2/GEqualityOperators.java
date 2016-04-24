/*
 * Copyright (c) 2016. Marek Berkan
 */
package pl.mberkan.oca.part2;

/**
 * - Example of equality operators (==, !=)
 * - be aware of assignment which looks like comparison!
 */
public class GEqualityOperators {

    void notFalidExamples() {
//        boolean x = true == 3;
//        boolean y = false != "Giraffe";
//        boolean z = 3 == "Kangaroo";
    }

    public static void main(String[] args) {
        boolean y = false;
        boolean x = (y = true);
        System.out.println(x);
    }
}
