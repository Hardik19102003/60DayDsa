package com.OOP.Assignment8;

abstract class Shape {
    // coordinate for center of the shapes
    public int x;
    public int y;

    //abstract method
    abstract void calculateArea();
    abstract void calculateCircumference();

    public Shape(int x,int y) {
        this.x = x;
        this.y = y;
    }

}

class Triangle extends Shape{

    public Triangle(int x, int y) {
        super(x, y);
    }

    @Override
    void calculateArea() {
        System.out.println("Area of a Triangle " );
    }

    @Override
    void calculateCircumference() {
        System.out.println("Circumference of a Triangle ");
    }
}

class Rectangle extends Shape{
    public Rectangle(int x, int y) {
        super(x, y);
    }

    @Override
    void calculateArea() {
        System.out.println("Area of a Rectangle : " + 4*x*y);
    }

    @Override
    void calculateCircumference() {
        System.out.println("Circumference of a Rectangle : " + 2*x*y);
    }

}

class Circle extends Shape{
    public Circle(int x, int y) {
        super(x, y);
    }

    @Override
    void calculateArea() {
        System.out.println("Area of a circle : " + (22*x*x)/7);
    }

    @Override
    void calculateCircumference() {
        System.out.println("Circle circumference : " + (2*22*x)/7);
    }

}

public class Main {
    public static void main(String[] args) {
        Shape t = new Triangle(2,2);
        t.calculateArea();
        t.calculateCircumference();

        Shape r = new Rectangle(2,2);
        r.calculateArea();
        r.calculateCircumference();

        Shape c = new Circle(2,2);
        c.calculateArea();
        c.calculateCircumference();
    }
}


