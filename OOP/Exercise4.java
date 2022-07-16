package com.OOP;

public class Exercise4 {

    public static void main(String[] args) {
        String str= "hello";
        System.out.println("String : " + str);
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < end; i++) {
            swap(arr,start,end);
            start++;
            end--;
        }
        String output = new String(arr);
        if(str.equals(output)) System.out.println("String is palindrome");
        else System.out.println("String is not palindrome");

    }

    static void swap(char[] arr ,int start , int end){
        char temp = arr[start];
        arr[start] =arr[end];
        arr[end] = temp;
    }
}
