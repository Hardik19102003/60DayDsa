package com.DSA.LAB9;

import java.util.*;

class Consecutive {
//check pairwise consecutive in stack
    static boolean pairWiseConsecutive(Stack<Integer> first)
    {
        // Transfer elements of first to second stack.
        Stack<Integer> second = new Stack<Integer> ();
        while (!first.isEmpty()) {
            second.push(first.peek());
            first.pop();
        }

        // Traverse second and check consecutive
        boolean ans = true;
        while (second.size() > 1) {
            //check first two are consecutive in second
            int x = second.peek();
            second.pop();
            int y = second.peek();
            second.pop();

            if (Math.abs(x-y) != 1){
                ans = false;
            }
            //again copy back in first stack
            first.push(x);
            first.push(y);
        }

        if (second.size() == 1){
            first.push(second.peek());
        }

        return ans;
    }

    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(4);
        stack.push(5);
        stack.push(-2);
        stack.push(-3);
        stack.push(11);
        stack.push(10);
        stack.push(5);
        stack.push(6);
        stack.push(20);

        if (pairWiseConsecutive(stack)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        System.out.println("Stack content after executing function : ");

        while (!stack.isEmpty())
        {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }

    }
}

