package com.HardikPatel;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,6,-7,8,-5,1,2,-3};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] array){
        boolean swapped;
        for (int i = 0; i < array.length; i++) {
            swapped = false;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    swapped = true;

                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
