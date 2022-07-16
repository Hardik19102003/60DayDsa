package com.DSA.LAB12;

import java.util.Arrays;

//implementation of Heap Sort
public class Sort {

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    static void heapify_desc(int[] arr, int n, int i)
    {
        int smallest = i; // Initialize smallest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is smaller than root
        if (l < n && arr[l] < arr[smallest])
            smallest = l;

        // If right child is smaller than smallest so far
        if (r < n && arr[r] < arr[smallest])
            smallest = r;

        // If smallest is not root
        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            // Recursively heapify the affected sub-tree
            heapify_desc(arr, n, smallest);
        }
    }

    // main function to do heap sort
    static void heapSortDescending(int[] arr, int n)
    {
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify_desc(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {

            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call min heapify on the reduced heap
            heapify_desc(arr, i, 0);
        }
    }

    static void heapSortAscending(int[] arr, int n)
    {
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify_asc(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify_asc(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap

    static void heapify_asc(int[] arr, int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify_asc(arr, n, largest);
        }
    }

    /* A utility function to print array of size n */
    static void displayArray(int[] arr, int n)
    {
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] arr = { 3, 5, 9, 4, 8, 7, 2, 6 };

        System.out.println("Array : " + Arrays.toString(arr));
        int n = arr.length;

        heapSortAscending(arr,n);

        System.out.println("\nSorted array in Ascending Order : ");
        displayArray(arr, n);

        heapSortDescending(arr, n);

        System.out.println("\nSorted array in Descending Order : ");
        displayArray(arr, n);

    }
}
