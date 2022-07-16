package com.OOP.Assignment12;

import java.util.Scanner;

//creates a Calculator class.
class Calculator
{
    int num1, num2;

    //constructor
    Calculator(int x,int y)
    {
        this.num1 = x;
        this.num2 = y;
    }

//    methods  Add (), Subtract (), multiply (), Division ( )
    void Add()
    {
        if(num1 < 0 || num2 < 0)
        {
            try{
                throw new ArithmeticException();
            }
            catch(ArithmeticException e){
//                If any negative number is entered then throw an exception
                System.out.println(num1 + " " + num2 + " Negative number entered ");
            }
        }
        else
        {
            // Addition
            System.out.println("Addition : "+ num1 +" + "+ num2 +" : "+(num1 + num2));
        }
    }
    void Subtract()
    {
        if(num1 <0 || num2 <0)
        {
            try{
                throw new ArithmeticException();
            }
            catch(ArithmeticException e){
//                If any negative number is entered then throw an exception
                System.out.println(num1 + " " + num2 +" Negative number entered");
            }
        }
        else
        {
            //Subtraction
            System.out.println("Subtraction : "+ num1 +" - "+ num2 +" = "+(num1 - num2));
        }
    }
    void Multiply()
    {
        if(num1 ==0 || num2 ==0)
        {
            try{
                throw new ArithmeticException();
            }
            catch(ArithmeticException e){
//                If zero is entered for any number then throw an exception
                System.out.println(num1 +" * "+ num2 + " Multiplication : Number 0 entered!");
            }
        }
        else
        {
            System.out.println("Multiplication : "+ num1 +" * "+ num2 +" : "+(num1 * num2));
        }
    }
    void Division()
    {
        if(num1 == 0 || num2 == 0)
        {
            try{
                throw new ArithmeticException();
            }
            catch(ArithmeticException e){

                System.out.println(num1 +" / "+ num2 + " Division : Number 0 entered!");
            }
        }
        else
        {
            System.out.println("Division : "+ num1 +" / "+ num2 +" : "+(num1 / num2));
        }
    }
}

class Calculation
{
    public static void main(String[] args) throws Exception
    {
        Scanner in = new Scanner(System.in);
         int num1 ;
         int num2 ;

        try{
            System.out.print("Enter two values : ");

             num1 = Integer.parseInt(in.next());
             num2 = Integer.parseInt(in.next());

             //Creating four objects for ass,subtract,multiply and division
            Calculator obj1 = new Calculator(num1,num2);
            obj1.Add();
            Calculator obj2 = new Calculator(num1,num2);
            obj2.Subtract();
            Calculator obj3 = new Calculator(num1,num2);
            obj3.Multiply();
            Calculator obj4 = new Calculator(num1,num2);
            obj4.Division();
        }
        catch(NumberFormatException e){
//            throw new NumberFormatException("NumberFormatException");
            System.out.println("Wrong input");
        }

    }
}
