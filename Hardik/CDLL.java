package com.Hardik;

public class CDLL {
    public Node head;
    public Node tail;
    private int size;

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;

        if(head != null){
            head.prev = node;
        }

        head = node;

        size+=1;
    }

    public void insertAfter(int after,int value){
        Node p= find(after);

        if(p==null){
            System.out.println("does not exist");
            return ;
        }
        Node node = new Node(value);
        node.next = p.next;
        p.next = node;

        if(node.next!=null){
            node.next.prev = node;
        }
        node.prev = p;
    }

    public Node find(int value){
        Node node = head;

        while(node!=null){
            if(node.value== value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertLast(int value){
        Node node = new Node(value);
        Node last = head;
        if(head == null){
           head = node;
           node.next = null;
           node.prev = null;
        }

        while (last.next != null){
            last = last.next;
        }

        last.next =node;
        node.next = null;
        node.prev = last;
        tail = node;

        size+=1;
    }

//    public void display(){
//        Node node = head;
//        while (node!= null){
//            System.out.print(node.value + "->");
//            node = node.next;
//        }
//        System.out.println("END");
//    }

    public void display(){
        Node node = head;
        Node last = null;
        while (node!= null){
            System.out.print(node.value + "->");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print in Reverse : ");
        while(last != null){
            System.out.print(last.value + "->");
            last = last.prev;
        }
        System.out.println("Start");
    }

     private class Node{
        private int value;
        private Node next;
        private Node prev;


        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next,Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

    }
}
