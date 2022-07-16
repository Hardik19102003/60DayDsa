package com.DSA.LAB8;

public class LL {

    private Node head;
    private Node tail;
    private int size;

        public LL() {
            this.size = 0;
        }

        public void insertFirst(int val) {
            Node node = new Node(val);
            node.next = head;
            head = node;

            if (tail == null) {
                tail = head;
            }
            size += 1;
        }

        public void insertLast(int val) {
            if (tail == null) {
                insertFirst(val);
                return;
            }
            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size++;
        }

        public void insert(int val, int index) {
            if (index == 0) {
                insertFirst(val);
                return;
            }
            if (index == size) {
                insertLast(val);
                return;
            }

            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }

            Node node = new Node(val, temp.next);
            temp.next = node;

            size++;
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
            System.out.println("END");
        }

        private class Node {
            private int value;
            private Node next;

            public Node(int value) {
                this.value = value;
            }

            public Node(int value, Node next) {
                this.value = value;
                this.next = next;
            }
        }

        //a. recursion reverse in linked-list
        private void reverse(Node node) {
            if (node == tail) {
                head = tail;
                return;
            }
            reverse(node.next);
            tail.next = node;
            tail = node;
            tail.next = null;
        }

        //b. Find Fibonacci series of length n
        static int fib(int num)
        {
            // Base Case
            if (num <= 1)
                return num;

            // Recursive call
            return fib(num - 1) + fib(num - 2);
        }

        //c. Count the sum of the digits of a given number
        static int findSum(int number) {
            if(number == 0){
                return number;
            }
            else{
                return number % 10 + findSum(number / 10);
            }
        }

            public static void main(String[] args) {
            LL first = new LL();

            first.insertLast(1);
            first.insertLast(2);
            first.insertLast(3);
            first.insertLast(4);
            first.insertLast(5);

            System.out.println("List before Reverse : ");
            first.display();
            first.reverse(first.head);
            System.out.println("List after Reverse : ");
            first.display();
            System.out.println();

            int num = 5;
            System.out.println("Fibonnaci series till " + num);
            for (int i = 0; i < num; i++) {
                System.out.print(fib(i) + " ");
            }
                System.out.println("\n");

            int number = 1234;
            System.out.println("The sum of digits "+ number + " = " + findSum(number));

            }
    }
