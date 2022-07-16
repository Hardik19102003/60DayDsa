package com.DSA.LAB9;

import java.util.Deque;
import java.util.LinkedList;

public class Dequeue<size> {

    public static void main(String[] args)
    {
        Deque<String> deque = new LinkedList<String>();

        // Add at the last
        // enqueue in Double ended queue
        System.out.println("Enqueue :");
        deque.add("Element 3 (rear)");
        deque.add("Element 4 (rear)");
        deque.addLast("Element 5 (rear)");
        deque.offer("Element 6 (rear)");

        System.out.println(deque + "\n");

        // remove the first element
        // dequeue in Double ended queue
        deque.removeFirst();

        System.out.println("Deque after removing first(dequeue) : " );
        System.out.println(deque);
    }
}