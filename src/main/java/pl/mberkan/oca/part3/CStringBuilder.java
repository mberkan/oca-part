/*
 * Copyright (c) 2016. Marek Berkan
 */
package pl.mberkan.oca.part3;

/**
 * StringBuilder:
 *  - since Java 5
 *  - not synchronized (StringBuffer is synchronized)
 */
public class CStringBuilder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("animals");
        sb.insert(7, "-");
        sb.insert(0, "-");
        sb.insert(4, "-");
        System.out.println(sb);

//        System.out.println(sb.length());
//        System.out.println(sb.indexOf("m"));
//        System.out.println(sb.charAt(6));
//
//        sb.append("+");
//        System.out.println(sb.charAt(6));

//        StringBuilder one = new StringBuilder();
//        StringBuilder two = new StringBuilder();
//        StringBuilder three = one.append("a");
//        System.out.println(one == two);
//        System.out.println(one == three);
//
//        String four = "";
//        System.out.println(one == four);
    }
}
