package com.DSA.EXAM;

// resume(); suspend();

class Thread11 extends Thread
{
    public void run()
    {
        try {
            System.out.println("First thread starts running");
            sleep(10000);
            System.out.println("First thread finishes running");
        }catch(Exception e) {}
    }
}

class Thread23 extends Thread
{
    public void run()
    {
        try {
            System.out.println("Second thread starts running");
            System.out.println("Second thread is suspended itself");
            suspend();
            System.out.println("Second thread starts running again");
        }catch(Exception e) {}
    }
}
public class thread_eg4 {
    public static void main(String []args)
    {
        try
        {
            Thread11 first = new Thread11(); //new born thread
            Thread23 second = new Thread23(); //new born thread

            first.start(); //first is scheduled for running
            second.start(); //second is scheduled for running

            System.out.println("Revive the second thread");
            second.resume();

            System.out.println("Second thread went for 10 sec sleep");
            second.sleep(10000);

            System.out.println("Second thread woke up");

        }catch(Exception e) {}
    }

}





//try {
//
//
//
//
//
//        }catch(Exception e) {}

