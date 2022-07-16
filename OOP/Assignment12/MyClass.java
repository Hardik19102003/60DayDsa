package com.OOP.Assignment12;


public class MyClass {
    public static void Method1()  {
        try {
//            Invoke Method2() from Method1()
            Method2();
        } catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println("Method 1 continues");
    }

    public static void Method2() throws Exception {
//        Invoke Method3() from Method2().
            Method3();
    }

    public static void Method3() throws Exception{
//        throw an exception inside Method3()
        throw new Exception();
    }


    public static void main(String[] args) {
        MyClass myClass = new MyClass();
       myClass.Method1();

    }
}
