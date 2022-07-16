package com.DSA.LAB8;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    private Queue<Integer> q1 = new LinkedList<>();//4
    private Queue<Integer> q2 = new LinkedList<>();//1 2 3
    private int top; // for tracking top

    public void push(int num){
        q1.add(num); // simply push or add in queue
        top = num;   // track top(update)
    }

    public int pop(){
        // iterate in q1 till reach last element
        while (q1.size()>1){
            top = q1.remove();
            q2.add(top); //copy element of q1 in q2
        }
        int ans = q1.remove();

        // swapping elements in both queues
        Queue<Integer> temp = q2;
        q2 = q1;
        q1 = temp;

        return ans;
    }

    public int top(){
        while (q1.size()>1){
            top = q1.remove();
            q2.add(top);
        }
        int ans = q1.peek();
        q1.remove();
        q2.add(ans);

        Queue<Integer> temp = q2;
        q2 = q1;
        q1 = temp;

        return ans;
    }

    // check if Queue 1 is empty or not
    public boolean empty(){
        return q1.isEmpty();
    }

    public static void main(String[] args) {
          MyStack stack = new MyStack();
          stack.push(1);
          stack.push(2);
          stack.push(3);
          stack.push(4);
          stack.push(5);

        System.out.println("pop = " + stack.pop());
        System.out.println("pop = " + stack.pop());
        System.out.println("pop = " + stack.pop());
        System.out.println();

        System.out.println("top = " + stack.top());
        System.out.println();

        System.out.println("pop = " + stack.pop());
        System.out.println("pop = " + stack.pop());
        System.out.println();
        System.out.println("empty = " + stack.empty());
    }
}