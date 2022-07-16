package com.DSA.EXAM;

//(1) extending the Thread class or (2) by implementing
// the runnable interface - run()

//start() - run()

// creating three threads using the class Thread and then
// running them concurrently

class ThreadA extends Thread{
    public void run()
    {
        for(int i=1; i<=5;i++)
        {
            System.out.println("From thread A with i = "+ -1*i);
            System.out.println("Thread " + Thread.currentThread() + "is running");
        }
        System.out.println("Exiting from Thread A...");
    }
}

class ThreadB extends Thread{
    public void run()
    {
        for(int j=1; j<=5;j++)
        {
            System.out.println("From thread B with j = "+ -2*j);
            System.out.println("Thread " + Thread.currentThread() + "is running");
        }
        System.out.println("Exiting from Thread B...");
    }
}

class ThreadC extends Thread{
    public void run()
    {
        for(int k=1; k<=5;k++)
        {
            System.out.println("From thread C with k = "+ -3*k);
            System.out.println("Thread " + Thread.currentThread() + "is running");
        }
        System.out.println("Exiting from Thread C...");
    }
}

public class Demonstration_11 {

    public static void main(String args[])
    {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        ThreadC c = new ThreadC();
        a.start();
        b.start();
        c.start();
        //System.out.println("....Multithreading is over");
    }

}
