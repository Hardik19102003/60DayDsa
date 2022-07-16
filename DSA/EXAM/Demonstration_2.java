package com.DSA.EXAM;

//suspend(); resume()

class Thread1 extends Thread
{
    public void run()
    {
        try {
            System.out.println("First thread start running");
            sleep(10000);
            System.out.println("First thread finishes running");
        }
        catch(Exception e) {}
    }
}

class Thread2 extends Thread
{
    public void run()
    {
        try {
            System.out.println("Second thread start running");
            System.out.println("Second thread is suspended itself");
            suspend(); //if not resumed then it is like stop()
            System.out.println("Second thread runs again");
        }
        catch(Exception e) {}
    }
}

public class Demonstration_2 {

    public static void main(String args[])
    {
        try {

            Thread1 first = new Thread1(); //It is a newborn state
            Thread2 second = new Thread2(); //another newborn state

            first.start(); //first is scheduled for running
            second.start(); //second is scheduled for running

            System.out.println("Revive the second thread");
            second.resume();

            System.out.println("Second thread want for 10 seconds sleep");
            second.sleep(10000);

            System.out.println("Wakeup second thread and finishes running");
            System.out.println("Demo is over");

        }catch(Exception e) {}
    }

}


//Question:
//Write a Java program which handles
//Push operation and Pop operation
//on stack concurrently.