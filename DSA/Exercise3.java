package com.DSA;

import java.util.Random;

public class Exercise3 {

    public static void main(String[] args) {
        Random objGenerator = new Random();
        int[] arr = new int[80];
        System.out.println("Random No : ");
        for (int i = 0; i< 80; i++){
            int randomNumber = objGenerator.nextInt(-5,20);
            arr[i] = randomNumber;
            System.out.print(randomNumber + " ");
        }
        int n = arr.length;
        maxSubArraySum(arr, n);
    }

    static void maxSubArraySum(int[] arr, int size)
    {
        int maximum = Integer.MIN_VALUE,
                endingMax = 0,start = 0,
                end = 0, s = 0;

        for (int i = 0; i < size; i++)
        {
            endingMax += arr[i];

            if (maximum < endingMax)
            {
                maximum = endingMax;
                start = s;
                end = i;
            }

            if (endingMax < 0)
            {
                endingMax = 0;
                s = i + 1;
            }
        }
        System.out.println("\nMaximum contiguous sum is "
                + maximum);
        System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);
    }
}
