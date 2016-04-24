/*
 * Copyright (c) 2016. Marek Berkan
 */
package pl.mberkan.oca.part3;

/**
 * Multidimensional arrays
 */
public class FMultiDimensionalArrays {

    public static void main(String[] args) {

        // 2D:
        int[][] vars1;
        int vars2[][];
        int[] vars3[];

        // 2D + 3D:
        int[] var4[], var5[][];

        // declaration:
        int[][] var6 = new int[3][2];
        int[][] var7 = new int[3][];
        // int[][] var8 = new int[][]; // -> first dimension has to be declared

        // different size
        int[][] differentSize = { { 1, 4}, {3}, {9, 8, 7}};
    }
}
