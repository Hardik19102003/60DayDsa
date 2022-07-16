package com.HardikPatel;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] array={67,34,15,7,1,0,-6,-9};
//        int[] array={-10,-2,0,23,34,53,67};
        int target=-6;
        System.out.println(orderAgnosticBS(array,target));

    }

     static int orderAgnosticBS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int mid;
        while(start<=end){

            mid=start+(end-start)/2;

            if(arr[start]<arr[end])
            {
                if(arr[mid]<target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else if(arr[mid]==target){
                return mid;
            }
            else{
                if(arr[mid]>target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
