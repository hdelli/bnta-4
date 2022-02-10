package com.bnta.calculator;

public class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int divide(int num1, int num2) throws Exception {
        if (num2 == 0) {
            throw new Exception("cannot divide");
        }
        return num1/num2;
    }


}
