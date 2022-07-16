package com.OOP.Assignment11;

import java.util.Random;


class MyThread1 extends Thread{
//    Create an object of random class
    Random random = new Random();


    public void run() {
        int x ;

        for(int i = 0; i < 5; i++) {
            // Generate random integers
            x = random.nextInt(10);
            System.out.println("Random Integer : " + x);

            //check even or odd
            if(x%2 == 0){

                Thread t2 = new MyThread2(x);
                t2.start();

            }
            else {
                Thread t3 = new MyThread3(x);
                t3.start();

            }
            try {
                //1 second delay
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}

class MyThread2 extends Thread{
    int x;

    //constructor
    public MyThread2(int n) {
        x = n;
    }

    //run() method which prints square of random integer
    public void run() {
        System.out.println("Square of " + x + " = " +x*x);
    }

}

class MyThread3 extends Thread{
    int x;
    public MyThread3(int n) {
        x = n;
    }

    //run() method which prints cube of random integer
    public void run() {
        System.out.println("Cube of " + x + " = " +x*x*x);
    }

}

public class Main {
    public static void main(String[] args) {
        //Create an object
        Thread t1 = new MyThread1();
        t1.start();

    }
}
