package com.Assignments;

import java.util.Scanner;

public class Assignment01 {
    //import java.util.Scanner;
    Scanner in = new Scanner(System.in);

    //1.Input a year and find whether it is a leap year or not.
    static void checkYear(int year){
        if(year%400 == 0 ){
            System.out.println("year " + year + " is a leap year.");
        }
        else if(year%100 != 0 && year%4 == 0){
            System.out.println("year " + year + " is a leap year.");
        }
        else {
            System.out.println("year "  + year + " is not a leap year.");
        }
    }

    //2.Take two numbers and print the sum of both.
    static void sum(int x, int y){
        System.out.println(x+y);
    }

//    3.Take a number as input and print the multiplication table for it.
    static void multiplication(int num){
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i +" = " + num*i);
        }
    }

//    Take 2 numbers as inputs and find their HCF(Highest Common Factor) and LCM(Least Common Multiple).
    static void hcfLcm(int a, int b){
        int i = 1;
        int num1 = a;
        int num2 = b;

        if(a==b){
            System.out.println("LCM = " + a);
        }

        while(a!=b){
            a = a * i;
            b = b * i;
            i++;
            if(a==b){
                System.out.println("LCM = " + a);
                break;
            }
        }
//        for (int j = num1; j*j >= num1; j--) {
//
//        }

    }
    public static void main(String[] args) {
//        checkYear(1900);
//
//        sum(4,5);
//        System.out.println(Integer.sum(2,3));

//        multiplication(3);

        hcfLcm(24, 15);
    }
}
