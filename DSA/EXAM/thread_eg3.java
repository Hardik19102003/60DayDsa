package com.DSA.EXAM;

// with thread

import java.time.*;
import java.io.*;
import java.util.concurrent.*;

class C1 extends Thread
{
    public void run()
    {
        for(int i = 1; i<5; i++)
        {
            System.out.println(i);
        }
    }
}

class C2 extends Thread
{
    public void run()
    {
        for(int i=10; i<15; i++)
        {
            System.out.println(i);
        }
    }
}
public class thread_eg3
{
    public static void main(String args[])
    {
        long start1 = System.nanoTime();
//        System.out.println(start1);


        C1 obj1 = new C1();
        obj1.start();

        C2 obj2 = new C2();
        obj2.start();
        long end1 = System.nanoTime();
//        System.out.println(end1);

//        TimeUnit seconds = new TimeUnit();
        System.out.println("Elapsed Time in nano seconds: "+ (end1-start1));
    }

}