package com.DSA.EXAM;

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("My Thread ");
    }
}

public class Demonstration_14 extends Thread {
    public void run()
    {
        for (int i=0; i<5; i++)
        {
            System.out.println("The thread name is" +Thread.currentThread().getName());
        }
    }

    public static void main(String[] args)
    {
        Demonstration_14 t1 = new Demonstration_14();
        MyThread t3 = new MyThread();
        t1.setName("Main Thread");


        t1.start();
        t3.start();

        Thread t2 = currentThread();
        t2.setName("Current Thread");

        for (int i=0; i<5; i++)
        {
            System.out.println("The thread name is" +t1.currentThread().getName());
        }
    }

}