package com.OOP;

import java.util.Scanner;

public class Exercise2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Enter the radius : ");
        double rad= in.nextDouble();
        Area  area=new Area(rad);
        System.out.println("Area of Circle is : " + area.areaOfCirc);
    }

    static class Area {
        double areaOfCirc;
        Area(double r)
        {
            areaOfCirc = r*r*22/7;

        }
    }
}
