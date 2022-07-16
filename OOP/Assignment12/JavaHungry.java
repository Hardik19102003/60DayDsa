package com.OOP.Assignment12;

public class JavaHungry {
    public static void main(String args[])
    {
        try {
            System.out.print("T");
            int num= 99/0;
            System.out.print("C");
        }
        catch(ArithmeticException ex)
        {
            System.out.print("R");
        }
        catch(Exception ex)
        {
            System.out.print("D");
        }
        System.out.print("Y");
    }
}
