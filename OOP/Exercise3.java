package com.OOP;

import java.util.Scanner;

public class Exercise3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter name = " );
        String name = in.nextLine();
        System.out.println("Enter enrolment no = "  );
        int enrollNo = in.nextInt();
        System.out.println("Enter marks Of science = ");
        int markOfSc = in.nextInt();
        System.out.println("Enter marks Of maths = " );
        int markOfMts = in.nextInt();
        System.out.println("Enter marks Of english = " );
        int markOfEng = in.nextInt();

        System.out.println("name = " + name );
        System.out.println("enrolment no = " + enrollNo );
        System.out.println("marks Of science = " + markOfSc );
        System.out.println("marks Of maths = " + markOfMts );
        System.out.println("marks Of english = " + markOfEng );

        int percentage = (markOfEng+markOfMts+markOfSc)/3;

        System.out.println("percentage = " + percentage);

    }
}
