//package com.DSA.LAB7;
//
//
//import java.util.Scanner;
//
//public class Main {
//
//    class Node
//    {
//        String name;
//        int Date;
//        int Month;
//        int Year;
//        String Birthplace;
//        Node next;
//    }
//    class HeaderNode
//        {
//        char character;
//         Node head;
//         HeaderNode next;
//        HeaderNode(char character, Node head, HeaderNode next)
//        {
//        this.character = character;
//        this.head = head;
//        this.next = next;
//        }
//        };
//        int numberofPeople = 0;
//        void insertInHeaderLL( HeaderNode head_ref,char character)
//        {
//        HeaderNode last = head_ref;
//        HeaderNode new_node = new HeaderNode(character,null,null);
//        if(head_ref == null)
//        {
//        head_ref = new_node;
//        return;
//        }
//        while(last.next!=null)
//        {
//        last = last.next;
//        }
//        last.next = new_node;
//        }
//        void push(Node head_ref, String name, int Date, int Month, int Year, String Birthplace)
//        {
//        Node last = head_ref;
//        Node new_node = new Node();
//        new_node.name = name;
//        new_node.Date = Date;
//        new_node.Year = Year;
//        new_node.Month = Month;
//        new_node.Birthplace = Birthplace;
//        new_node.next = null;
//        if(head_ref == null)
//        {
//        head_ref = new_node;
//        return;
//        }
//
//        while(last.next!=null)
//        {
//        if(((last.name).compare(name) < 0) && ((last.next.name).compare(name)>0))
//        {
//        Node save = last.next;
//        last.next = new_node;
//        new_node.next = save;
//        return;
//        }
//        last = last.next;
//        }
//        last.next = new_node;
//        }
//
//        HeaderNode searchLL( HeaderNode head_ref,char firstChar)
//        {
//        HeaderNode temp = head_ref;
//        if(temp == null)
//        {
//            System.out.println("Not Found");
//        return null;
//        }
//        while(temp.next != null)
//        {
//        if(temp.character == firstChar)
//        {
//            System.out.println("Found" + firstChar + "in HeaderLL");
//        return temp;
//        }
//        temp = temp.next;
//        }
//        if(temp.next == null && temp.character == firstChar)
//        {
//        return temp;
//        }
//        return null;
//        }
//
//        void display(Node head)
//        {
//        Node n = head;
//        if(n == null )
//        {
//        return;
//        }
//        while((n.next) !=null)
//        {
//            System.out.println(n.name + " " + n.Date + " " + n.Month + " " + n.Year + " " + n.Birthplace + " ");
//        n = n.next;
//        }
//            System.out.println(n.name + " " + n.Date + " " + n.Month + " " + n.Year + " " + n.Birthplace);
//        }
//        void displayHeaderNodeLL(HeaderNode head)
//        {
//        HeaderNode n = head;
//        if(n == null)
//        {
//            System.out.println("Empty Linkedlist");
//        return;
//        }
//        while((n.next) !=null)
//        {
//            System.out.println("List of employee's name starting with " +  n.character);
//        display(n.head);
//        n = n.next;
//        }
//            System.out.println("List of employee's name starting with " +  n.character);
//        display(n.head);
//        }
//        void deleteNode( HeaderNode head_ref,String diedperson)
//        {
//        HeaderNode temp = head_ref;
//        Node temp2 = temp.head;
//        if(temp == null)
//        {
//        return;
//        }
//        while(temp != null)
//        {
//        temp2 = temp.head;
//        if(temp.character != diedperson[0]){
//        temp = temp.next;
//        temp2 = temp.head;
//        continue;
//        }
//        Node prev= null;
//        while (temp2!=null)
//        {
//        if(temp2.name == diedperson && temp.head == temp2)
//        {
//        temp.head = temp2.next;
//        delete temp2;
//        numberofPeople--;
//        return;
//        }
//        else if(temp2.name == diedperson)
//        {
//        prev.next = temp2.next;
//        numberofPeople--;
//        delete temp2;
//        return;
//        }
//        prev = temp2;
//        temp2 = temp2.next;
//        }
//        temp = temp.next;
//        }
//        }
//        boolean search(Node head_ref,String name)
//        {
//        Node temp = head_ref;
//        if(temp == null)
//        {
//        return false;
//        }
//        while(temp!=null)
//        {
//        if(temp.name == name)
//        {
//        return true;
//        }
//        temp = temp.next;
//        }
//        return false;
//        }
//        int countPeopleFromParticularCharacter(Node head_ref)
//        {
//        int count = 0;
//        Node temp = head_ref;
//        if(temp == null)
//        {
//        return 0;
//        }
//        while(temp!=null)
//        {
//        count++;
//        temp = temp.next;
//        }
//        return count;
//        }
//        int countAgegreaterthan25(HeaderNode head_ref,int Year)
//        {
//        HeaderNode temp = head_ref;
//        Node temp3 = temp.head;
//        int count =0;
//        if(temp == null)
//        {
//        return 0;
//        }
//        while(temp!=null)
//        {
//        temp3 = temp.head;
//        while(temp3!=null)
//        {
//        if(Year - temp3.Year  > 25)
//        {
//        count++;
//            System.out.println("count : " + count);
//        }
//        temp3 = temp3.next;
//        }
//        temp = temp.next;
//        }
//            System.out.println("count : " + count);
//        return count;
//        }
//        void EnlistNameThroughBirthplace(HeaderNode head_ref,String Birthplace)
//        {
//        HeaderNode temp = head_ref;
//        Node temp3 = temp.head;
//        while(temp!=null)
//        {
//        temp3 = temp.head;
//        while(temp3!=null)
//        {
//        if(temp3.Birthplace == Birthplace)
//        {
//            System.out.println(temp3.name);
//        }
//        temp3 = temp3.next;
//        }
//        temp =temp.next;
//        }
//        }
//
//public static void main(String[]args){
//    Scanner in = new Scanner(System.in);
//
//        HeaderNode pointerToHeaderLL=null;
//        for(int i=0;i< 10;i++)
//        {
//        insertInHeaderLL(&pointerToHeaderLL,(char)('A'+i););
//        }
//        displayHeaderNodeLL(pointerToHeaderLL);
//    System.out.println("Enter 1 for entering the details in the appropriate linked list");
//    System.out.println("Enter 2 for deleting the details in the appropriate linked list");
//    System.out.println("Enter 3 for searching for the person with a particular name, if exists");
//    System.out.println("Enter 4 for counting the total number of people in the company's database");
//    System.out.println("Enter 5 for counting the total number of people having name starting with a particular character");
//    System.out.println("Enter 6 for  Count the number of people having age greater than 25 years");
//    System.out.println("Enter 7 for Enlist the names of people belonging to a particular birthplace");
//
//
//        while(true)
//        {
//        int x,flag=0;
//        String name,Birthplace;
//        int Date,Month,Year;
//       x = in.nextInt();
//        HeaderNode matchingHeaderNode;
//        boolean exists;
//        char searchWithCharacter;
//        int countPeoplewithCharacter;
//        String  diedperson;
//        String  searchName;
//        String  searchwithBirthplace;
//        int ThisYear;
//        int countPeopleAgeGreaterthan25;
//        switch(x)
//        {
//        case 1:
//            name = in.nextLine();
//            Date = in.nextInt();
//            Month = in.nextInt();
//            Year = in.nextInt();
//            Birthplace = in.nextLine();
//
//        matchingHeaderNode=searchLL(&pointerToHeaderLL,name[0]);
//        if(matchingHeaderNode!=null)
//        {
//        push(matchingHeaderNode.head,name,Date,Month,Year,Birthplace);
//        numberofPeople++;
//        }
//        displayHeaderNodeLL(pointerToHeaderLL);
//        break;
//        case 2:
//            System.out.println(diedperson);
//        deleteNode(&(pointerToHeaderLL),diedperson);
//        displayHeaderNodeLL(pointerToHeaderLL);
//        break;
//        case 3:
//        searchName = in.nextLine();
//        matchingHeaderNode=searchLL(&pointerToHeaderLL,searchName[0]);
//        if(matchingHeaderNode!=null)
//        {
//        exists=search(&(matchingHeaderNode.head),searchName);
//        }
//        if(exists==1){
//            System.out.println(searchName + " Exists in the List ");
//        }
//        else
//        {
//            System.out.println(searchName + " Does not Exists in the List ");
//        }
//        break;
//        case 4:
//            System.out.println("Total Number of People are : " + numberofpeople);
//
//        break;
//        case 5:
//
//        searchWithCharacter = (char) in.nextInt();
//        matchingHeaderNode=searchLL(&pointerToHeaderLL,searchWithCharacter);
//        if(matchingHeaderNode!=null)
//        {
//        countPeoplewithCharacter=countPeopleFromParticularCharacter(&(matchingHeaderNode.head));
//        }
//            System.out.println("Total number of people having name starting with a particular character are " + countPeoplewithCharacter);
//        break;
//
//        case 6:
//
//        ThisYear = in.nextInt();
//        countPeopleAgeGreaterthan25=countAgegreaterthan25(&(pointerToHeaderLL),ThisYear);
//            System.out.println(" Total number of people having age greater than 25 years are " + countPeopleAgeGreaterthan25);
//        break;
//        case 7:
//
//        searchwithBirthplace = in.nextLine();
//        EnlistNameThroughBirthplace(&(pointerToHeaderLL),searchwithBirthplace);
//        break;
//default:
//        flag=1;
//        break;
//        }
//        if(flag==1)
//        break;
//        }
//        }
//        }
