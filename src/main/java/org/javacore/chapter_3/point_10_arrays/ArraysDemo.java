package org.javacore.chapter_3.point_10_arrays;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] array = {1, 5, 9, 12, 3};

        /* array copying, both variables refer to the same array:
         * the same by Arrays.copyOf() method
         */

        /*1
        int[] copyOfArray = array;
        */

        //2
        /*The copied arrays can have more length, than the original array.
        The additional elements are filled with 0 if the array contains numbers, false
        if the array contains boolean values. Conversely, if the length is less than the
        length of the original array, only the initial values are copied.
        */
        int[] copyOfArray = Arrays.copyOf(array, 2 * array.length);
        copyOfArray[2] = 5;

        for (int i : array) {
            System.out.print(i + " ");
        }

        //Arrays.toString()
        System.out.println("\nArrays.toString() demo: " + Arrays.toString(array));

        System.out.println("6th element of copyOfArray array: " + copyOfArray[6]);

        Arrays.sort(copyOfArray);
    }
}
