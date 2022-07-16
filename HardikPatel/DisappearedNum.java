package com.HardikPatel;

import java.util.Arrays;

public class DisappearedNum {
    public static void main(String[] args) {
        int[] nums = {1 , 3 ,4 ,5,8};
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[correct]!=nums[i]){
                swap(nums,correct,i);
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString( nums));

    }

     static void swap(int[] arr, int correct, int i){
        int temp = arr[correct];
        arr[correct] = arr[i];
        arr[i] = temp;
    }

}


