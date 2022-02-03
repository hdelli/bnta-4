package com.bnta.week_two_wed.ErrorHandling;

public class ErrorHandling {
    public static void main(String[] args) {

        try {
            int result = Integer.parseInt("10"); //<--parseInt takes a string and converts it to a int but it has to include numbers
            //there's no way to write letters to number e.g letter with special character! it wont work
            System.out.println(result);

        } catch (NumberFormatException e) {
            System.out.println("oops input not a number"); //you can have numerous catches
        } //catch (Exception e) //this is anything thats outside of the try
        {}
        //catch (ArithmeticException) {
          //  System.out.println("cant be divided by 0");
        }

        //int results= Integer.parseInt("Linda"); //this is going to fail because it is a string, it is the wrong data type
        //System.out.println(results);

//exit code 0
        //exit code 1= wrong

        //Exception in thread "main" java.lang.NumberFormatException: For input string: "Linda", the numberformatexception is a class error
    }

/*
int [] numbers = {1, 2, 3, 0, 4, 5}; //if theres an input you need to think there

    for (int number : numbers) {
        int add = (number + 100) / number;
        result += add;


 */


