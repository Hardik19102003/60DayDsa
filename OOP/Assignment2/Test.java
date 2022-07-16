package com.OOP.Assignment2;

class Test extends Thread{
    public void run(){
        System.out.println("thread is running...");
    }

    public static void main(String[] args){
        Test t1=new Test();
        t1.start();
        Test2 m1=new Test2();
        // Using the constructor Thread(Runnable r)
        Thread t2 =new Thread(m1);
        t2.start();
    }
}

//implementing runnable interface
class Test2 implements Runnable{
    public void run(){
        System.out.println("thread is running using runnable interface...");
    }
}