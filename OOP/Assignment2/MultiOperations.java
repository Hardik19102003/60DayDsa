package com.OOP.Assignment2;

import static java.lang.Thread.sleep;

class Addition implements Runnable
{
    public void run() {
        int i = 1;
        while (i <= 5) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread For Addition : "+ i);
            i+= 2;
        }
    }
}
class Subtraction implements Runnable
{
    public void run() {
        int i = 10;
        while (i >=5) {
            System.out.println("Thread For subtraction : "+ i);
            i = i - 3;
        }
    }
}
class Multiplication implements Runnable
{
    public void run()
    {
        int i = 1;
        while (i <= 10) {
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread For Multiplication : "+ i);
            i = i*2;
        }
    }
}
class MultiProcess implements Runnable
{
    public void run() {
        int i = 1;
        while (i <= 5) {
            System.out.println("Thread For Multiple Processes : "+i);
            i = (i * 2) + 2;
        }
    }
}
public class MultiOperations {

    public static void main(String[] args) {
        Addition a = new Addition();
        Thread t1 = new Thread(a);
        Subtraction s = new Subtraction();
        Thread t2 = new Thread(s);
        Multiplication m = new Multiplication();
        Thread t3 = new Thread(m);
        MultiProcess mp = new MultiProcess();
        Thread t4 = new Thread(mp);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}