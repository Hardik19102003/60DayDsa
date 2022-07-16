package com.OOP.Assignment11;

class Counter {
    //synchronized method
    synchronized void decrementCounter(int counter){

        for(int i=1;i<=5;i++){
//            Print in Decrement Order
            System.out.println(counter--);

            try{
                Thread.sleep(1000);
            }
            catch(Exception exception){
                System.out.println(exception);
            }
        }

    }
}

class Thread1 extends Thread{
    Counter t;
    Thread1(Counter t){
        this.t=t;
    }
    public void run(){
        t.decrementCounter(0);
    }

}
class Thread2 extends Thread{
    Counter t;
    Thread2(Counter t){
        this.t=t;
    }
    public void run(){
        t.decrementCounter(10);
    }
}

public class testCounter{
    public static void main(String[] args){
//        Create an object
        Counter obj = new Counter();
        Thread1 t1=new Thread1(obj);
        Thread2 t2=new Thread2(obj);
        t1.start();
        t2.start();
    }
}