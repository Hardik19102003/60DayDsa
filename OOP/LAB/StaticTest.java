package com.OOP.LAB;

class Car
{
    int maxSpeed = 132;

    void display(){
        System.out.println("max Speed = " + maxSpeed + " Mph");
    }
}

class BMW extends Car{
    int maxSpeed = 300;

    void display(){
        System.out.println("max Speed = " + super.maxSpeed + " Mph");
    }
}

public class StaticTest{
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new BMW();
        car.display();
        car1.display();
    }
}