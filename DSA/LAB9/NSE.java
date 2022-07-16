package com.DSA.LAB9;

import java.util.HashMap;
import java.util.Stack;

public class NSE {

    public static void displayNSE(int[] arr, int n)
    {
        Stack<Integer> stack = new Stack<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        // push the first element to stack
        stack.push(arr[0]);

        // iterate for rest of the elements
        for (int i = 1; i < n; i++) {

            if (stack.empty()) {
                stack.push(arr[i]);
                continue;
            }

            // if stack is not empty, then pop and popped element is greater than next
            while (!stack.empty() && stack.peek() > arr[i]) {
                map.put(stack.peek(), arr[i]); // print the pair
                stack.pop();
            }

			// push next element to stack
            stack.push(arr[i]);
        }

		// for remaining one in stack print -1
        while (!stack.empty()) {
            map.put(stack.peek(), -1);
            stack.pop();
        }

        for (int i = 0; i < n; i++){
            System.out.println(arr[i] + " -> " + map.get(arr[i]));
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 5, 4, 2, 3, 1};
        System.out.println("The next smaller elements are : ");
        displayNSE(arr, arr.length);
    }
}
