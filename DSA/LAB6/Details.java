package com.DSA.LAB6;

import java.util.Scanner;

public class Details {
    public static Scanner in = new Scanner(System.in);

    private final String name;
    private final String branch;
    private Node head;
    private Node tail;
    private int size;

    public Details(String name,String branch){
        this.name = name;
        this.branch = branch;
    }

    class Node{
        private int data;
        private Node next;
        private String name,branch;
        private Node position;

        public Node(int data){
            this.data = data;
        }
        public Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
    }

    public void insert(int data){
        if(true) {
            insertFirst(data);
        }
        else {
            insertLast(data);
        }
    }
     public void delete(int data){
        if(true) {
            deleteFirst(data);
        }
        else {
            deleteLast(data);
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

    public void insertLast(int data){
        if(tail == null){
            insertFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size+=1;
    }

   public void deleteFirst(int data){
//        Node node = new Node(data);
       head = head.next;
        size-=1;
    }

    public void deleteLast(int data){
        if(tail == null){
            insertFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size+=1;
    }

    public void display(){
        Node temp = head;
        while(temp != null)
        System.out.println(temp.name + " " + temp.branch + " " + temp.position);
        temp = temp.next;
    }

    public static void main(String[] args) {
        Details student1 = new Details("1","ict");
//        student1.display();
        int a = in.nextInt();

        Details student2 = new Details("2","mnc");
//        student2.display();
        Details student3 = new Details("0","ict");
//        student3.display();
        Details student4 = new Details("3","mnc");
//        student4.display();
        Details student5 = new Details("-1","ict");
//        student5.display();
        Details student6 = new Details("-2","mnc");
//        display();

    }
}


