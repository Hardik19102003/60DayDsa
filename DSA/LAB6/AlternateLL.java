package com.DSA.LAB6;

public class AlternateLL {
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

    //merge first and second list till one of the list's head reaches null
    void merge(AlternateLL list) {
        Node L1_head = head;
        Node L2_head = list.head;
        Node list1_next;
        Node list2_next;

        while (L1_head != null && L2_head != null) {
            // Save next pointers
            list1_next = L1_head.next;
            list2_next = L2_head.next;

            // insert
            L2_head.next = list1_next;
            L1_head.next = L2_head;

            // update current pointers for next iteration
            L1_head = list1_next;
            L2_head = list2_next;
        }
        list.head = L2_head;
    }


    public static void main(String[] args) {
        AlternateLL list1 = new AlternateLL();
        list1.insertFirst(5);
        list1.insertFirst(7);
        list1.insertFirst(17);
        list1.insertFirst(13);
        list1.insertFirst(11);
        System.out.println("First linkedList : ");
        list1.display();

        AlternateLL list2 = new AlternateLL();
        list2.insertFirst(12);
        list2.insertFirst(10);
        list2.insertFirst(2);
        list2.insertFirst(4);
        list2.insertFirst(6);
        System.out.println("Second linkedList : ");
        list2.display();

        list1.merge(list2);

        System.out.println("After merging First linkedList : ");
        list1.display();
        System.out.println("After merging Second linkedList : ");
        list2.display();
    }
}