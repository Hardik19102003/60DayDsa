package com.DSA.LAB6;

import java.util.Scanner;

public class Student {
    static Scanner in = new Scanner(System.in);

    private Node head;
    private Node tail;
    private int size;

    public Student() {
        this.size = 0;
    }

    public void insertFirst(String name, String branch, int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(String name, String branch, int val) {
        if (tail == null) {
            insertFirst(name, branch, val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

//    public void insert(int val, int index) {
//        if (index == 0) {
//            insertFirst(val);
//            return;
//        }
//       else {
//            insertLast(val);
//            return;
//        }

//        Node temp = head;
//        for (int i = 1; i < index; i++) {
//            temp = temp.next;
//        }
//
//        Node node = new Node(val, temp.next);
//        temp.next = node;

//        size++;
//    }

//    public int deleteLast() {
//        if (size <= 1) {
//            return deleteFirst();
//        }
//
//        Node secondLast = get(size - 2);
//        int val = tail.data;
//        tail = secondLast;
//        tail.next = null;
//        size--;
//        return val;
//    }

//    public int delete(int index) {
//        if (index == 0) {
//            return deleteFirst();
//        }
//        if (index == size - 1) {
//            return deleteLast();
//        }
//
//        Node prev = get(index - 1);
//        int val = prev.next.data;
//
//        prev.next = prev.next.next;
//        size--;
//        return val;
//    }
//
//    public int deleteFirst() {
//        int val = head.data;
//        head = head.next;
//        if (head == null) {
//            tail = null;
//        }
//        size--;
//        return val;
//    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

//    public Node get(int index) {
//        Node node = head;
//        for (int i = 0; i < index; i++) {
//            node = node.next;
//        }
//        return node;
//    }

    public static void main(String[] args) {
        Student student1 = new Student();

        System.out.println("How many students are there ?");
        int num = in.nextInt();

        int n;
       while(num >=1){
           System.out.println("Press 1 for input at beggining\nPress 2 for input at last");
           n = in.nextInt();

                   System.out.println("Enter student's name");
                   String name1 = in.nextLine();
                   System.out.println("Enter course name");
                   String branch1 = in.nextLine();
                   System.out.println("Enter position");
                   int data1 = in.nextInt();
                   if(data1 >=1){
                       student1.insertLast(name1, branch1, data1);
                   }else {
                       student1.insertFirst(name1, branch1, data1);
                   }


                   String name2 = in.nextLine();
                   String branch2 = in.nextLine();
                   int data2 = in.nextInt();


           num--;
       }
        student1.display();
    }
}
