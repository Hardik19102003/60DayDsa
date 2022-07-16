package com.DSA.LAB6;

class FindLOOP {
    Node head;
    int size;

    FindLOOP(){
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void insertFirst(int data)
    {
        Node node = new Node(data);
        node.next = head;
        head = node;
        size+=1;
    }

    String findLoop()
    {
        Node oneStepPointer = head, twoStepPointer = head;
        int count = 0;

        while (oneStepPointer != null && twoStepPointer != null && twoStepPointer.next != null) {
            oneStepPointer = oneStepPointer.next;
            twoStepPointer = twoStepPointer.next.next;
            if (oneStepPointer == twoStepPointer) {
              return "loop found";
            }
        }
       return "Loop does not found";
    }

    public static void main(String[] args)
    {
        FindLOOP list = new FindLOOP();

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);

        list.head.next.next.next.next = list.head;

        System.out.println( list.findLoop());

    }
}

