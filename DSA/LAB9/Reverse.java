package com.DSA.LAB9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Reverse {
    static Queue<Integer> q;

    static void reverseQtillN(int n)
    {
        if (q.isEmpty() || n > q.size() || n <= 0){
            return;
        }

        Stack<Integer> stack = new Stack<Integer>();

        // Push the first n elements into a Stack
        for (int i = 0; i < n; i++) {
            stack.push(q.peek());
            q.remove();
        }

        // put back stack element into queue
        while (!stack.empty()) {
            q.add(stack.peek());
            stack.pop();
        }

        // Remove the remaining elements and enqueue
        // them at the end of the Queue
        for (int i = 0; i < q.size() - n; i++) {
            q.add(q.peek());
            q.remove();
        }
    }

    // print Queue
    static void display()
    {
        // Queue is not empty
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }

    public static void main(String args[])
    {
        q = new LinkedList<Integer>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);

        int n = 4;
        reverseQtillN(n);
        System.out.println("After reverse till "+ n + " element queue is : ");
        display();
    }
}

