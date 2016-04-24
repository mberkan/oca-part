/*
 * Copyright (c) 2016. Marek Berkan
 */
package pl.mberkan.oca.part2;

/**
 * Operators:
 * - order
 */
public class AOperators {
    public static void main(String[] args) {
        int y = 4;
        double x = 3 + 2 * --y;

        System.out.println("y: " + y + ", x: " + x);
    }

    // order:
    // - post (x++)
    // - pre (++x)
    // - other unary (+, -, !)
    // - *, /, %
    // - +, -
    // - shift (<<, >>, >>>) - not expected on the OCA exam
    // - relation (<, >, <=, => , instanceof)
    // - equal
    // - logical (&, ^, |),
    // - short-circuit logical (&&, ||),
    // - ternary ( x? y : z),
    // - assignments
}
