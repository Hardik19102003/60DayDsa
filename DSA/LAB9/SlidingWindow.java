package com.DSA.LAB9;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindow
{
    static void displayMax(int[] arr, int n, int x)
    {
        // Double ended queue in decreasing order value from front to rear
        Deque<Integer> Q = new LinkedList<Integer>();

        int i;
        for (i = 0; i < x; i++)
        {
            // For every element, the previous
            // smaller elements are useless so
            // remove them from q
            while (!Q.isEmpty() && arr[i] >= arr[Q.peekLast()]){
                // Remove from rear
                Q.removeLast();
            }

            // Add new element at rear of queue
            Q.addLast(i);
        }

        // remaining elements from arr[x] to arr[n-1]
        for (; i < n; i++)
        {
            // Front element is the largest element of previous window
            System.out.print(arr[Q.peek()] + " ");

            // Remove the elements which are out of this window
            while ((!Q.isEmpty()) && Q.peek() <= i - x){
                Q.removeFirst();
            }

            //remove useless elements which are smaller than current being added element
            while ((!Q.isEmpty()) && arr[i] >= arr[Q.peekLast()])
                Q.removeLast();

            // Add current element at the rear of Q
            Q.addLast(i);
        }

        // Print the maximum element of last window
        System.out.print(arr[Q.peek()]);
    }

    public static void main(String[] args)
    {
        int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };

        System.out.println("Array elements are : " + Arrays.toString(arr));

        System.out.println("For sliding window max elements are :");
        displayMax(arr, arr.length, 3);
    }
}

