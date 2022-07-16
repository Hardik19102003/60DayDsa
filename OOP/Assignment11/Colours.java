package com.OOP.Assignment11;

import java.util.Random;


public class Colours implements Runnable {

    public static void main(String[] args) {
        Colours color = new Colours();
        Thread t1 = new Thread(color);
        t1.start();
    }


    public void run(){
        Random random = new Random();
        String[] colours = {"white", "blue", "black", "green", "red", "yellow"};
        int index;

        while ((index = random.nextInt(6)) != 4) {
            System.out.println("index = " + index + " = " + colours[index]);
        }
    }

}

