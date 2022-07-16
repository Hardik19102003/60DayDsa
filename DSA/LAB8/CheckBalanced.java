package com.DSA.LAB8;

import java.util.*;

public class CheckBalanced {

    //check if brackets are balanced
    static String checkBalanced(String str)
    {
        Stack<Character> stack = new Stack<>();

        // Traversing the Expression
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if (ch == '{' || ch == '(' || ch == '[')
            {
                // Push the element in the stack
                stack.push(ch);
            }

            // brecket must be open if not close
            if (stack.isEmpty()) {
                return "Not Balanced";
            }
            char check;
            switch (ch) {
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[') {
                        return "Not Balanced";
                    }
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{') {
                        return "Not Balanced";
                    }
                    break;

                case ')':
                    check = stack.pop();
                    if (check == '[' || check == '{') {
                        return "Not Balanced";
                    }
                    break;
            }
        }

        // Check if Stack is emptyy
        return "Balanced";
    }

    public static void main(String[] args)
    {
        String str1 = "[(A+B)-(C+D)}";
        System.out.println(str1);
        System.out.println(checkBalanced(str1));
        System.out.println();

        String str2 = "[A+B(C+D(E+G)]";
        System.out.println(str2);
        System.out.println(checkBalanced(str2));
        System.out.println();

        String str3 = "[A+{B+(C+D)+E}+F]";
        System.out.println(str3);
        System.out.println(checkBalanced(str3));
    }
}
