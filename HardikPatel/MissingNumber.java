package com.HardikPatel;

//import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] array={0,1};
        System.out.println(missingNum(array));
    }

    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int missingNum(int[] array){
        int i=0;

        while(i< array.length){
            int correct=array[i];
            if(array[i]<array.length && array[i]!=array[correct]){
                swap(array,i,correct);
            }else{
                i++;
            }
        }

        for ( i = 0; i < array.length; i++) {
            if(array[i]!=i)
                return i;
        }
        return array.length;
    }
}
