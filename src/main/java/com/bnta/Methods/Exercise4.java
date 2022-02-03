package com.bnta.Methods;

/*
Write a method which takes two numbers as arguments and prints one of:

        "The first number is larger"
        "The second number is larger"
        "The numbers are equal"
        as appropriate.



 */
public class Exercise4 {
    public static void main(String[] args) {

        compareValues(4,4);

    }

    public static void compareValues(int num1, int num2){

        //take in two numbers

        //compare numbers (if else)

        if (num1 > num2) {
            System.out.println("the first number is larger");
        } else if (num2>num1) {
            System.out.println("the second number is larger");
        } else if (num1 == num2) {
            System.out.println("the numbers are equal");
        }


       // else if (num1)
        // if first number is larger then return print this
        //if second number is larger print
    }
}


