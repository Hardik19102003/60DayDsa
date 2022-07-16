package com.Hardik;

public class CCLL {
    private Node head;
    private Node tail;
    int size;

    public void insert(int value){
        Node node = new Node(value);

        if(head == null){
            head = node;
            tail = node;
            return;
        }

        node.next = head;
        tail.next = node;
        tail = node;
    }

    public void display(){
        Node node = head;
        if(head!=null){
            do {
                System.out.print(node.value + "->");
                node = node.next;
            }while (node!=head);
        }
        System.out.println("HEAD");
    }

    public void delete(int value){
        Node node = head;
        if(head == null){
            return ;
        }

        if(node.value == value){
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if(n.value == value){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node!=head);
    }

    private class Node{
       private int value;
       private Node next;
       private

        Node(int value){
            this.value = value;
        }
        Node(int value,Node next){
            this.value = value;
            this.next = next;
        }

    }
}
