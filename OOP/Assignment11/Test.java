package com.OOP.Assignment11;


class Display {
    //without synchronized method
     void displayTable(String str){

        for(int i=1;i<=10;i++){

            System.out.println(str);

            try{
                Thread.sleep(400);
            }
            catch(Exception exception){
                System.out.println(exception);
            }
        }

    }
}

class Thred1 extends Thread{
    Display t;
    Thred1(Display t){
        this.t=t;
    }
    public void run(){
        System.out.println("Without Synchronization : ");
        t.displayTable("JAVA");
    }

}
class Thred2 extends Thread{
    Display t;
    Thred2(Display t){
        this.t=t;
    }
    public void run(){
        t.displayTable("C++");
    }
}

public class Test {
    public static void main(String[] args){
//        Create an object
        Display obj = new Display();
        Thred1 t1=new Thred1(obj);
        Thred2 t2=new Thred2(obj);
        t1.start();
        t2.start();
    }
}
