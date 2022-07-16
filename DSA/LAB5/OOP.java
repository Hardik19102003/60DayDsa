package com.DSA.LAB5;

class Student{
    String name;
    int stdId;

    Student(Student s2){
        this.name = s2.name;
        this.stdId = s2.stdId;
    }
    Student(){

    }
    void printInfo(){
        System.out.println(this.name);
        System.out.println(this.stdId);
    }
}
class Shape {
    String colour;
    int height;
//    int base;
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}
class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println(this.colour);
        System.out.println(0.5*b*h);
    }
    Triangle(){
        this.colour = "blue";
    }
}
class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}

public class OOP{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "dev";
        s1.stdId = 202103032;

        Student s2 = new Student(s1);
        s2.printInfo();
//        Shape T1 = new Shape();
        Triangle t = new Triangle();
        t.area(1,2);

    }
}
