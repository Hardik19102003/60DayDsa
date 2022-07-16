package com.HardikPatel;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array={1,3,5,7,9,10,23,50,51,76,90};
        int target=90;
        System.out.println(binarySearch(array,target));

    }

      static int binarySearch(int[] arr,int target ){
        int start=0;
        int end= arr.length-1;
        int mid;
        while(start<=end){

            mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
     }
}
