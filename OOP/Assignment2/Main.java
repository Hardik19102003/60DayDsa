package com.OOP.Assignment2;

import java.util.*;
//implement runnable interface
class MyThread implements Runnable {

    // run() method whenever thread is invoked
    public void run()
    {
        // Try block to check for exceptions
        try {
            // making thread to
            Thread.sleep(1000);
        }

        // Catch block to handle the exceptions
        catch (Exception exception) {
            System.out.println(exception);
        }
    }
}

public class Main {
    public static void main(String[] args)
    {
        //create multiple threads(5 threads) through for loop
        for (int threadNum = 0; threadNum < 5;threadNum++) {

            // Creating single thread object
            Thread t = new Thread(new MyThread());

            // Setting name of the particular thread
            t.setName("MyThread:" + threadNum);

            // Starting the current thread
            t.start();
        }

        // Creating set object to hold all the threads
        Set<Thread> threadSet = Thread.getAllStackTraces().keySet();//return all threads

        // thread status using getState() method
        for (Thread t : threadSet) {
            System.out.println("Thread :" + t + ":" + "Thread status : " + t.getState());
        }
    }
}


