package com.bnta.Methods;

public class Exercise3 {
    public static void main(String[] args) {

        boolean result = sameInt(3, 4);
        System.out.println(result);
    }

    public static boolean sameInt(int input1, int input2) {
        boolean inputIsSame = true;

        if (input1 == input2) {
            return inputIsSame;
        } else {
            inputIsSame = false;
            return inputIsSame;
        }


    }
}
