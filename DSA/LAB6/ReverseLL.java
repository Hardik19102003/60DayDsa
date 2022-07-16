package com.DSA.LAB6;

public class ReverseLL {
    private Node head;
    private Node tail;

    public void insertFirst(int val) {
        //creating node
        Node node = new Node(val);
        node.next = head;
        head = node;

        //when list is empty
        if (tail == null) {
            tail = head;
        }
    }

    public void display() {
        //save head because head has to be at beginning
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");

    }

    // creating our own data type called Node
    private static class Node {
        private final int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    Node reverse(Node head, int k)
    {
        if(head == null)
            return null;
        Node current = head;
        Node next = null;
        Node prev = null;
        int count = 0;

        // Reverse first k nodes of linked list
        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        //next is now a pointer to (k+1)th node
        if (next != null)
            head.next = reverse(next, k);

        // prev = head
        return prev;
    }


    public static void main(String[] args) {
        ReverseLL list = new ReverseLL();
        list.insertFirst(9);
        list.insertFirst(8);
        list.insertFirst(7);
        list.insertFirst(6);
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);

        System.out.println("Before Reverse : ");
        list.display();

        list.head = list.reverse(list.head, 3);
        System.out.println("After Reverse : ");
        list.display();
    }
}
