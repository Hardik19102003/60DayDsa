package com.DSA.EXAM;

//import java.lang.Thread;

class test_thread2 implements Runnable
{
    public void run()
    {
        System.out.println("Saurabh");
    }
}

public class thread_eg2
{
    public static void main(String args[])
    {
        test_thread2 T = new test_thread2();
        Thread Thr = new Thread(T);
        Thr.start();
    }
}
