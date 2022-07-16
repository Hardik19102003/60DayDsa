package com.OOP.Assignment2;

class Hello extends Thread {
    synchronized public void run() {
        try {
            int i=0;
            while (i<3) {
                System.out.println("Hello");
                i++;
            }
        } catch (Exception ignored) {
        }
    }
}

class Welcome extends Thread {
    synchronized public void run() {
        try {
            int i=0;
            while (i<3) {
                sleep(130);
                System.out.println("Welcome");
                i++;
            }
        } catch (Exception ignored) {
        }
    }
}

public class Multi {
    public static void main(String[] args) {
        //print 3 times hello and welcome
        Hello t1 = new Hello();
        Welcome t2 = new Welcome();
        t1.start();
        t2.start();
    }
}
