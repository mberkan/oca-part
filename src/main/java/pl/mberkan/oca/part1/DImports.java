/*
 * Copyright (c) 2016. Marek Berkan
 */
package pl.mberkan.oca.part1;

import java.util.Random;

// import java.util.* // <-- allowed

// import java.*.Random; // <-- not allowed!

import java.util.Date;
// import java.sql.Date; // <-- conflict

// import java.util.*;
// import java.sql.*; // <-- conflict



/**
 * Examples:
 *  - Import wildcards are allowed only on the end of import line.
 *  - Conflicts
 *  - Full package names
 */
public class DImports {
    public static void main(String[] args) {
        System.out.println(new Random().nextInt());
        System.out.println(new Date());

        System.out.println(new java.util.Date()); // <-- full package
        System.out.println(new java.sql.Date(System.currentTimeMillis()));
    }
}
