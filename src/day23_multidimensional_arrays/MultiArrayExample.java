package day23_multidimensional_arrays;

import java.util.Arrays;

public class MultiArrayExample {
    public static void main(String[] args) {

        int [] n = {5, 10, 20, 10}; // Single dimensional array
        int [] m = {5, 10, 100, 39, 19}; // Single dimensional array

        int[] [] all = {n, m}; // we stored already declared SINGLE array into multidimensional / 2D array

        System.out.println(all); // will give some hascode/memory location for 2d array
        System.out.println(Arrays.toString(all));// wwill give some hascode/memory location for each SINGLE array
        System.out.println(Arrays.deepToString(all));
        System.out.println();

        int [] [] multi ={
                {90,80,70},      // SINGLE ARRAY at 2D array index 0
                {19,324,5646,23},// SINGLE ARRAY at 2D array index 1
                {234, 324},      // SINGLE ARRAY at 2D array index 2
                {65}             // SINGLE ARRAY at 2D array index 3
        };
        System.out.println(multi.length);
        System.out.println(multi[0].length);
        System.out.println(multi[1].length);
        System.out.println(multi[2].length);
        System.out.println(multi[3].length);

        System.out.println();

        System.out.println(multi[1][2]);
        // System.out.println(multi[3][2]); ArrayIndexOutBoundsException: index 2 out of bounds length 1
        System.out.println();
        System.out.println(multi[1]);
        System.out.println(Arrays.toString(multi[1]));
    }
}
