package com.OOP.Assignment12;

import java.util.Scanner;

public class Voting {

    public void vote(int age) throws Exception {
            if(age>=18){
                System.out.println(" eligible to vote");
            }
            else {
//                If the age is less than 18, it throws a custom exception
                throw new Exception(" not eligible to vote");
            }
    }


    public static void main(String[] args)  {
        Voting voting = new Voting();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the age : ");
        int age = in.nextInt();

        try {
            voting.vote(age);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}