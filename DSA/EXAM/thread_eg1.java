package com.DSA.EXAM;

//import java.lang.Thread;

class test_thread extends Thread
{
    public void run()
    {
        System.out.println("Saurabh");
    }
}

public class thread_eg1
{
    public static void main(String args[])
    {
        test_thread T = new test_thread();
        T.start();
    }
}
