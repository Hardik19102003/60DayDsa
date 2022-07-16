package com.DSA;

import java.util.Scanner;

public class NumberOfWords {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String str = in.nextLine();
        count(str);
    }

    static void count(String str){
        char[] ch = str.toCharArray();
        int letter = 0;
        int space = 0;
        int word = 1;
        for(int i = 0; i < str.length(); i++){
            if(Character.isLetter(ch[i])){
                letter ++ ;
            }
            if(Character.isSpaceChar(ch[i])){
                space ++ ;
                word ++;
            }
        }
        System.out.println("Number of letters are = " + letter);
        System.out.println("Number of spaces are = " + space);
        System.out.println("Number od Words are = " + word);
    }

}
