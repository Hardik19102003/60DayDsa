package com.OOP.LAB5;

class Person {
    public void talk() {
        System.out.print("First Program");
    }
}
class Student extends Person {
    public void talk() {
        System.out.print("Second Program");
    }
}
public class Exercise4 {
    public static void main(String args[]) {
        Person p = new Student();
        p.talk();
    }
}