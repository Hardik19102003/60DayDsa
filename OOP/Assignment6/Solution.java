package com.OOP.Assignment6;

//class Cycle{
//
//    String getline(){
//        return " who is a vehicle with pedals.";
//    }
//}

//class Bike extends Cycle {
//    @Override
//    String getline() {
//        return "My ancestor is a cycle";
//    }
//    Bike(){
//        System.out.println("Hello I am a motorcycle, I am a cycle with an engine.\n" + getline() + super.getline()
//        );
//    }
//}

import java.util.Scanner;

public class Solution {
    public String draw() //1
    {
        return draw();
    }

    public String draw(String s) //1
    {
        return "h";
    }
//    public void draw(String s) {} //2
    public void draw(double f) {}
    public static Scanner in = new Scanner(System.in);

    static {
        int B = in.nextInt();
        int H = in.nextInt();

        if (H >= 0 && H<=100 && B>=0 && B<=100) {
            System.out.println(H*B);
        }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

        public static void main(String[] args) {
//            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//            Cycle b1 = new Bike();


        }
}
