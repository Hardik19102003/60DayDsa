package com.OOP.Assignment8;

//statement 2
interface Bicycle {
    //statement 3
    // in interface properties are by default final
    final int s = 100;
    void applyBrake(int decrement);
    void speedUP(int increment);
}

interface Car{
    void gear(int gear);
}

//statement 1
class Hero implements Bicycle,Car{
    int speed = 8;

    public void applyBrake(int decrement) {
        speed = speed - decrement;
        System.out.println("decremnted speed = " + speed);
    }

    public void speedUP(int increment) {
        speed = speed + increment;
        System.out.println("incremented speed = " + speed);
    }

    @Override
    public void gear(int gear) {
        System.out.println("gear = " + gear);
    }

}

public class Vehicle{
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.applyBrake(2);
        hero.speedUP(5);
        hero.gear(3);
        // we can not modify the properties in interface as they are final
      //  hero.s = 100;
        System.out.println("main speed : " + hero.s);
    }
}
