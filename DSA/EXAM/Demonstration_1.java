package com.DSA.EXAM;

//States:  newborn; runnable; running; Blocked; dead
//start(); stop(); yield(); sleep(); suspend(); resume()

// Use of yield() - running->runnable , stop(); sleep() methods

class ClassA extends Thread{
    public void run()
    {
        System.out.println("Start Thread A...");
        for(int i=1; i<=5; i++)
        {
            if(i==1) {
                Thread.yield();
            }
            System.out.println("From Thread A: i ="+i);
        }
        System.out.println("...Exit thread A");
    }
}

class ClassB extends Thread{
    public void run()
    {
        System.out.println("Start Thread B...");
        for(int j=1; j<=5; j++)
        {
            System.out.println("From Thread B: j ="+j);
            if(j==2) stop();
        }
        System.out.println("...Exit thread B");
    }
}

class ClassC extends Thread{
    public void run()
    {
        System.out.println("Start Thread C...");
        for(int k=1; k<=5; k++)
        {
            System.out.println("From Thread C: k ="+k);
            if(k==3)
            {
                try {
                    sleep(1000);
                }catch(Exception e) {}
            }
        }
        System.out.println("...Exit thread C");
    }
}
public class Demonstration_1 {
    public static void main(String args[])
    {
        ClassA t1 = new ClassA();
        ClassB t2 = new ClassB();
        ClassC t3 = new ClassC();
        t1.start(); t2.start(); t3.start();

        System.out.println("...End of Execution");
    }

}

//try {
//  sleep(10000);
//	}
//	catch(Exception e) {
//  Block of code to handle errors
//	}
