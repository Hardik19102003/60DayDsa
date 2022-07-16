package com.OOP.Assignment9;

interface Vehicle {
    void Speed();
    void Accelerator();
    void Brake();
}

interface Bicycle {
    final int s = 100;
    void Brake(int decrement);
    void Accelerator(int increment);
    void Speed(int speed);
}

class Hero implements Bicycle {
    int speed = 0;
    int maxSpeed = 15;
    int minSpeed = 0;

    public void Brake(int decrement) {
        speed = speed - decrement;
        if(speed <= minSpeed){
            System.out.println( "Speed is less than min Speed : 0");
            return ;
        }
        System.out.println("-" + decrement +" decremented speed = " + speed);
    }

    public void Accelerator(int increment) {
        speed = speed + increment;

        if(speed >= maxSpeed){
            System.out.println("Speed is greater than max threshold Speed");
            return ;
        }

        System.out.println("+" + increment + " incremented speed = " + speed);
    }

    @Override
    public void Speed(int speed) {
        this.speed = speed ;
    }

}

public class Main{
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.Speed(3);
        System.out.println("Max speed : " + hero.maxSpeed);
        System.out.println("Min speed : " + hero.minSpeed);
        System.out.println("Speed : " + hero.speed);
        hero.Brake(2);
        System.out.println("Speed : " + hero.speed);
        hero.Accelerator(5);
        System.out.println("Speed : " + hero.speed);
        hero.Accelerator(15);
        System.out.println("Speed : " + hero.speed);
        hero.Brake(6);

    }
}
