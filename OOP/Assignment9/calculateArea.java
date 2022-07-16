package com.OOP.Assignment9;

interface SHAPE{
//    int l = 2;
//    int b = 2;

    double area(int l, int b);
    double area(int l);
}

class Circle implements SHAPE{

    @Override
    public double area(int l, int b) {
        if (l == b){
            return Math.PI*l*l;
        }
        return 0;
    }

    @Override
    public double area(int r) {
        return Math.PI*r*r;
    }
}

class Rectangle implements SHAPE{

    @Override
    public double area(int l, int b) {
        return l*b;
    }

    @Override
    public double area(int x) {
        return 0;
    }
}

class Square implements SHAPE{

    @Override
    public double area(int l, int b) {
        if (l == b){
            return l*l;
        }
        return 0;
    }

    @Override
    public double area(int l){
        return l*l;
    }
}

public class calculateArea {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Area of a Circle : " + circle.area(3));

        Rectangle rectangle = new Rectangle();
        System.out.println("Area of a Rectangle : " +  rectangle.area(3,4));

        Square square = new Square();
        System.out.println("Area of a square : " + square.area(4));
    }
}
