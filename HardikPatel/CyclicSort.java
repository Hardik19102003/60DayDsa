package com.HardikPatel;


import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static void swap(int[] arr,int correct,int i){
        int temp = arr[correct];
        arr[correct] = arr[i];
        arr[i] = temp;
    }

    static int[] sort(int[] array){
        int i = 0;
        while(i<array.length){
            int correct = array[i] - 1;
            if(array[correct]!=array[i]){
                swap(array,correct,i);
            }
            else{
                i++;
            }
        }
        return array;
    }
}
