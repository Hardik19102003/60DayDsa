package com.OOP.LAB5;

class Sum{
    Sum(int a, int b){
        System.out.println(a+b);
    }
    Sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    Sum(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }
}
public class Exercise3 {
    public static void main(String[] args) {
        Sum s1 = new Sum(5,5);
        Sum s2 = new Sum(5,5,5);
        Sum s3 = new Sum(5,5,5,5);

    }
}
