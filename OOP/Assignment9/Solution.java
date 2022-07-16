package com.OOP.Assignment9;

import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {

    public int divisor_sum(int n) {

        if (n <= 1) {
            return n;
        }

        int sum = n + 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum;
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        MyCalculator calculator = new MyCalculator();

        System.out.print("I implemented: ");

        ImplementedInterfaceNames(calculator);

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(calculator.divisor_sum(n) + "\n");
        in.close();
    }

    static void ImplementedInterfaceNames(Object o){

        Class[] theInterfaces = o.getClass().getInterfaces();

        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
