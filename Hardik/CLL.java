package com.Hardik;

public class CLL {
    private Node head;
    private Node tail;

    private int size;

    public  CLL(){
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size+=1;
    }

    public void insertLast(int value){
        if (tail == null){
            insertFirst(value);
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        node.next = null;

        size+=1;
    }

    public void insert(int index,int value){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }

        Node temp = head;

        for (int i = 1; i <index; i++) {
            temp = temp.next;
        }

        Node node = new Node( value, temp.next);
        temp.next = node;

        size+=1;
    }

    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if(head==null){
            tail = head;
        }
        size--;
        return value;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;

        size--;
        return val;
    }

    public int delete(int index){
        if(index == 0){
            deleteFirst();
        }
        if(index == size){
            deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value){
        Node node = head;
       while(node != null){
           if(node.value == value){
               return node;
           }
       }
        return null;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private String name;
        private String course;
        private Node next;

        Node(int value){
            this.value = value;
        }

        Node(int value,Node next){
            this.value = value;
            this.next = next;
        }

        Node(int value,Node next,String name,String course){
            this.value = value;
            this.next = next;
            this.name = name;
            this.course = course;
        }
        Node(int value,String name,String course){
            this.value = value;
//            this.next = next;
            this.name = name;
            this.course = course;
        }
    }

    // Questions
    // 1.) Remove duplicates

    public void duplicate(){
        Node node = head;

        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }
            else{
                node = node.next;
            }
        }

        tail = node;
        tail.next = null;
    }


    public static CLL merge(CLL first, CLL second) {
        CLL.Node f = first.head;
        CLL.Node s = second.head;

        CLL ans = new CLL();

        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }

        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
    }
    //find min value in the list
    public void minNode() {
        Node current = head;
        int min;
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            min = head.value;
            while(current != null){
                if(min > current.value) {
                    min = current.value;
                }
                current= current.next;
            }
            System.out.println("Minimum value in the list: " +
                    min);
        }
    }

    //find max value in the list
    public void maxNode() {
        Node current = head;
        int max;
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            max = head.value;
            while(current != null){
                if(max < current.value) {
                    max = current.value;
                }
                current = current.next;
            }
            System.out.println("Maximum value in the list : " + max);
        }
    }

    public Boolean hasCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            if(fast == slow){
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }

        return false;
    }

}
