package com.DSA;

import java.util.Scanner;

public class Exercise1 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Exercise1 rotate = new Exercise1();
        int[] arr = { 1, 2, 3, 4, 5 };
        int position = in.nextInt();
        position--;
        rotate.Change(arr, position, arr.length);

        for (int j : arr) System.out.print(j + " ");
    }

    void Change(int[] arr, int index, int length)
    {
        for (int i = 0; i < index; i++)
            swap(arr, length);
    }

    void swap(int[] arr, int length)
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < length - 1; i++)
            arr[i] = arr[i + 1];
        arr[length-1] = temp;
    }
}
