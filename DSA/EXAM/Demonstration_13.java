package com.DSA.EXAM;

//Demonstration of thread class methods: getID() and getName();

//Demonstration by implementing runnable interface
class ThreadId	extends Thread{
    public void run()
    {
        System.out.println("Thread " + Thread.currentThread() + "is running");
    }
}

public class Demonstration_13 {

    public static void main(String[] args)
    {
        int n=8; //number of threads
        for (int i=0; i<8; i++)
        {
            ThreadId obj = new ThreadId();
            obj.start();
        }
    }

//Thread Thread[Thread-0 (getName),5 (getID), main]is running

}
