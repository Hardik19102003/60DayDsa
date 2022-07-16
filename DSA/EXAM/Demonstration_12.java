package com.DSA.EXAM;

//(2) implementing the runnable interface - run()

//start() - run()

// creating three threads using the runnable interface and then running them
// concurrently

class ThreadX implements Runnable{
    public void run()
    {
        for(int i=1; i<=5;i++)
        {
            System.out.println("From thread X with i = "+ -1*i);
        }
        System.out.println("Exiting from Thread X...");
    }
}

class ThreadY implements Runnable{
    public void run()
    {
        for(int j=1; j<=5;j++)
        {
            System.out.println("From thread Y with j = "+ -2*j);
        }
        System.out.println("Exiting from Thread Y...");

    }
}

class ThreadZ implements Runnable{
    public void run()
    {
        for(int k=1; k<=5;k++)
        {
            System.out.println("From thread Z with k = "+ -3*k);
        }
        System.out.println("Exiting from Thread Z...");

    }
}

public class Demonstration_12 {

    public static void main(String args[])
    {
        ThreadX x = new ThreadX();
        Thread t1 = new Thread(x);
        //t1.setPriority(Thread.MAX_PRIORITY);

        ThreadY y = new ThreadY();
        Thread t2 = new Thread(y);

        //t2.setPriority(t2.getPriority()+1);

        Thread t3 = new Thread (new ThreadZ());
        //t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

        //System.out.println("....Multithreading is over");
    }

}
