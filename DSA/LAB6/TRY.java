package com.DSA.LAB6;

import com.Hardik.LL;

import java.util.Scanner;

public class TRY {
    static Scanner in = new Scanner(System.in);
    Node head;
    Node tail;
    int size;

    class Node{
        Node next;
        String data;
        Node(String data){
            this.data = data;
        }
    }

    public void insertFirst(String data) {
        Node node = new Node(data);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(String data) {
        if (tail == null) {
            insertFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size++;
    }

    public String deleteFirst() {
        String data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return data;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public String  deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        String  val = tail.data;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public static void main(String[] args) {
        TRY node = new TRY();

        node.insertFirst("Hardik");
        node.insertFirst("Devansh");
        node.insertLast("dhruv");
        node.insertFirst("hey");
        node.display();

        System.out.println("After deletion :");
        node.deleteFirst();
        node.deleteLast();
        node.display();

    }
}
