package com.OOP.LAB5;

class Count{
    //methode overloading
    //only chang the number of arguments
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
    int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        Count c = new Count();
        System.out.println("sum of two numbeers : " + c.sum(1,2));
        System.out.println("sum of three numbeers : " + c.sum(1,2,3));
        System.out.println("sum of four numbeers : " + c.sum(1,2,3,4));
    }
}
