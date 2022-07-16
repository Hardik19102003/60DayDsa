package com.DSA.LAB9;

import java.util.Queue;
import java.util.LinkedList;

public class CheckPalindromeString {

     static void check(String str,Queue queue){

        for (int i = str.length()-1; i >=0; i--) {
            queue.add(str.charAt(i));
        }

        String reverseString = "";

        while (!queue.isEmpty()) {
            reverseString = reverseString + queue.remove();
        }

        if (str.equals(reverseString)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }

    }

    public static void main(String[] args) {
        String str1 = "nayan";
        Queue queue1 = new LinkedList();

        System.out.print(str1 + " is ");
         check(str1,queue1);

         String str2 = "forever";
        Queue queue2 = new LinkedList();

        System.out.print(str2 + " is ");
        check(str2,queue2);

    }
}