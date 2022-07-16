package com.DSA.EXAM;

// without thread

import java.time.*;
        import java.io.*;
        import java.util.concurrent.*;

class C1_1 extends Thread
{
    public void run_1()
    {
        for(int i = 1; i<5; i++)
        {
            System.out.println(i);
        }
    }
}

class C2_1 extends Thread
{
    public void run_2()
    {
        for(int i=10; i<15; i++)
        {
            System.out.println(i);
        }
    }
}
public class thread_eg4Copy
{
    public static void main(String args[])
    {
        long start1 = System.nanoTime();


        C1_1 obj1 = new C1_1();
        obj1.run_1();

        C2_1 obj2 = new C2_1();
        obj2.run_2();
        long end1 = System.nanoTime();

        //TimeUnit seconds = new TimeUnit();
        System.out.println("Elapsed Time in nano seconds: "+ (end1-start1));
    }

}
