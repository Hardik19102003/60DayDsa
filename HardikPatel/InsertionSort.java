package com.HardikPatel;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array={5,4,3,2,1};
        System.out.println(Arrays.toString(iSort(array)));
    }

    static void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    static int[] iSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = array.length-1; j >0 ; j--) {
                if(array[j]<array[j-1]){
                    swap(array,j,j-1);
                }else{
                    break;
                }
            }
        }
        return array;
    }
}
