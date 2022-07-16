package com.DSA;

import java.util.Scanner;

public class Exercise2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the total number of Subject : ");
        int num = in.nextInt();

        System.out.println("Enter the total number of students : ");
        int st = in.nextInt();

        int[][] arr = new int[st][num];

        System.out.println("Enter the marks in each subject ");
        for(int i=0;i < st;i++)
        {
            for (int j = 0; j < num; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int sum = 0;
        for(int i=0;i<st;i++)
        {
            for (int j = 0; j < num ;j++) {
                sum = sum+arr[i][j];
            }

        }

        System.out.println("Average marks : " + sum/num);
        System.out.println("The total marks is : " + sum);

        float percentage = (sum / (float)num);

        System.out.println( "Percentage : " + percentage + "%");
    }
}
