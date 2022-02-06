package com.bnta.methods;

public class practise {
    public static void main(String[] args) {
        multiply(5,10);
        welcome();


        int a= 5;
        int b=10;
        System.out.println(a * b);

        int c= 4;
        int d=3;
        System.out.println(c * d);
    }
    public static void welcome() {
        System.out.println("Welcome to our calculator!");
    }

    public static void multiply(int a, int b) {
        System.out.println(a*b);
    }
}
