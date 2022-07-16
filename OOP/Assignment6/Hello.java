package com.OOP.Assignment6;

class Animal {
    String colour = "black";
    public void display() {
        System.out.println("I like cats");
    }
}
 class Cat extends Animal{
    String colour = "white";
    public void display(){
        System.out.println("my" + super.colour + colour);
    }
}

public class Hello {
    public static void main(String[] args) {
        Animal a1 = new Cat();
//        Cat c1 = new Cat();
        a1.display();

    }
}

