package com.DSA.EXAM;

// multithreading example with get and set priorities


// setPriority(int p);
//MIN-PRIORITY - 1
//NORM-PRIORITY - 5
//MAX-PRIORITY - 10

public class thread_eg5 extends Thread
{
    public void run()
    {
        System.out.println("Inside run method");
    }

    public static void main(String[]args)
    {
        thread_eg5 t1 = new thread_eg5();
        thread_eg5 t2 = new thread_eg5();
        thread_eg5 t3 = new thread_eg5();

        System.out.println("thread1 thread priority : " + t1.getPriority()); // Default 5
        System.out.println("thread2 thread priority : " + t2.getPriority()); // Default 5
        System.out.println("thread3 thread priority : " + t3.getPriority()); // Default 5

        t1.setPriority(3);
        t2.setPriority(5);
        t3.setPriority(8);

        // t3.setPriority(); will throw IllegalArgumentException
        System.out.println("thread1 thread priority : " + t1.getPriority());  //3 : MIN
        System.out.println("thread2 thread priority : " + t2.getPriority()); //5 : NOR
        System.out.println("thread3 thread priority : " + t3.getPriority());//8 : MAX

        // Main thread
        //System.out.print(Thread.currentThread().getName());
        System.out.println("Main thread priority : " + Thread.currentThread().getPriority());

        // Main thread priority is set to 10
        Thread.currentThread().setPriority(10);
        System.out.println("Main thread priority : " + Thread.currentThread().getPriority());

        t1.start();
        t2.start();
        t3.start();
    }

}
