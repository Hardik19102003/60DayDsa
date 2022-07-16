package com.OOP.LAB5;

class Shape{
    double area_Of_Square(double l){
        return l*l;
    }
    double area_Of_Rectangel(double l,double b){
        return l*b;
    }
    double area_Of_Circle(double r){
        return 3.14*r*r;
    }
    double area(){
        return 0;
    }
}

class Square extends Shape{
    @Override
    double area()
    {
        return area_Of_Square(2);
    }
}

class Rectangle extends Shape{
    @Override
   double area(){
       return area_Of_Rectangel(2,3);
   }
}

class Circle extends Shape{
    @Override
   double area(){
       return area_Of_Circle(1);
   }
}

public class Exercise1 {
    public static void main(String[] args) {
        Square s1 = new Square();
        //for square length must be the same for all sides
        System.out.println("Area of Square = " + s1.area());

        Rectangle s2 = new Rectangle();
        System.out.println("Area of Rectangle = " + s2.area());

        Circle s3 = new Circle();
        System.out.println("Area of Circle = " + s3.area());
    }
}
