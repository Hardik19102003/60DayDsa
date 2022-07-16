package com.HardikPatel;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};

        System.out.println(Arrays.toString(sSort(arr)));
    }

    static int[] sSort(int[] array){

        for (int i = 0; i < array.length; i++) {

            int last=array.length-i-1;
            int maxIndex=getMaxIndex(array,0,last);
            swap(array,maxIndex,last);
        }
        return array;
    }

    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    static int getMaxIndex(int[] array,int start,int end){
        int max=start;
        for (int i = start; i <=end; i++) {
            if(array[max]<array[i]){
                max=i;
            }
        }
        return max;
    }

}
