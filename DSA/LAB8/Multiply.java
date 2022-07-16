package com.DSA.LAB8;

import java.util.LinkedList;
import java.util.Scanner;

public class Multiply {
    private Node head;
    private Node tail;
    private int size;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

     public void insertFirst(int data){
         Node node = new Node(data);
         node.next = head;
         head = node;

        if(tail == null){
            tail = head;
        }

        size+=1;
    }

    public void display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    static class Stack{
        private static Node head;
        public static int size;

        public static boolean isEmpty(){
            return head == null;
        }

        public void push(int data){
           Node node = new Node(data);
           if(isEmpty()){
               head = node;
           }
            node.next = head;
            head = node;

            size+=1;
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;

            size--;
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Multiply list = new Multiply();
        Stack stack = new Stack();

        stack.push(2);
        stack.push(1);
        stack.push(4);
        stack.push(3);
        stack.push(5);

        System.out.println("Enter the number you want to multiply :");
        int n = in.nextInt();
         int num;
        while(stack.size>=1){
              num = stack.pop()*n;
              list.insertFirst(num);
        }

        list.display();

    }
}
