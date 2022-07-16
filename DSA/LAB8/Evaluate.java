package com.DSA.LAB8;

class Evaluate{
//check if a given character is operand
    static boolean isOperand(char c)
    {
        return (c >= '0' && c <= '9');
    }

    // find value of and operand
    static int value(char c)
    {
        return (int)(c - '0');
    }

    //evaluates simple expressions.
    static int evaluate(String str)
    {
        // Base Case: Given expression is empty
        if (str.length() == 0){
            return -1;
        }

        //find First operand value
        int val = value(str.charAt(0));

        // Traverse the remaining characters in pairs
        for (int i = 1; i<str.length(); i += 2)
        {
            // on even position must be : operand
            // and on odd must : operator
            char opr = str.charAt(i), opd = str.charAt(i+1);

            // If next to next character is not an operand
            if (isOperand(opd) == false){
                return -1;
            }

            // Update result according to the operator
            if (opr == '+'){
                val += value(opd);
            }
            else if (opr == '-'){
                val -= value(opd);
            }
            else if (opr == '*'){
                val *= value(opd);
            }
            else if (opr == '/'){
                val /= value(opd);
            }
            // If not a valid operator
            else {
                return -1;
            }
        }
        return val;
    }

    public static void main(String[] args)
    {
        String str1 = "3-2*3";
        int val = evaluate(str1);
        if(val == -1){
            System.out.println(str1 + " is Invalid");
        }
        else {
            System.out.println("Value of "+str1+" is "+val);
        }

        String str2 = "1-2/2";
        val = evaluate(str2);
        if(val == -1){
            System.out.println(str2+" is Invalid");
        }
        else{
            System.out.println("Value of " + str2+" is "+val);
        }
    }
}
