package com.OOP.Assignment8;

public abstract class Bank{
    public abstract int getRateOfInterest();

    public static void main(String[] args) {
        Bank bank1=new SBI();
        Bank bank2=new PNB();
        System.out.println("Rate of Interest in SBI is: "+bank1.getRateOfInterest()+" %");
        System.out.println("Rate of Interest in PNB is: "+bank2.getRateOfInterest()+" %");
    }
}

class SBI extends Bank{
    public int getRateOfInterest(){
        return 8;
    }
}

class PNB extends Bank{
    public int getRateOfInterest(){
        return 6;
    }
}


