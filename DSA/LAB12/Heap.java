package com.DSA.LAB12;

import java.util.Arrays;

public class Heap {
    void isHeap(int[] arr, int n) {
        isMinHeap(arr,n);
        isMaxHeap(arr,n);
    }

        void isMaxHeap ( int[] arr, int n)
        {
            //root to last interval node
            for (int i = 0; i < (n - 2) / 2; i++)
            {
                // If left child is greater than its parent then return
                if (arr[2 * i + 1] > arr[i]) {
                    return;
                }
                // If right child is greater its parent then return
                if (2 * i + 2 < n && arr[2 * i + 2] > arr[i]) {
                    return;
                }
            }
            System.out.println("MAX Heap");
        }

        void isMinHeap ( int[] arr, int n){
            //root to last interval node
            for (int i = 0; i < (n - 2) / 2; i++)
            {
                // If left child is smaller, return
                if (arr[2 * i + 1] < arr[i]) {
                    return;
                }
                // If right child is smaller, return
                if (2 * i + 2 < n && arr[2 * i + 2] < arr[i]) {
                    return;
                }
            }
            System.out.println("MIN Heap");
        }

    public static void main(String[] args) {
        int[] arr1 = {90, 15, 10, 7, 12, 2, 7, 3};
        int n1 = arr1.length;
        System.out.println("Array : " + Arrays.toString(arr1));

        Heap h = new Heap();
        h.isHeap(arr1, n1);

        int[] arr2 = {5, 12, 10, 14, 15, 11, 13};
        int n2 = arr1.length;
        System.out.println("Array : " + Arrays.toString(arr1));
        h.isHeap(arr2,n2);

        int[] arr3 = {5, 12, 10, 8, 15, 9, 13};
        int n3 = arr1.length;
        System.out.println("Array : " + Arrays.toString(arr1));
        h.isHeap(arr3,n3);



    }
}

