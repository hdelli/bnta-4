package com.bnta.week_two_mon;

public class Exercise3 {
    public static void main(String[] args) {

       // int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //System.out.println(odd(numbers));


       // Scanner numbers = new Scanner(System.in);
       // System.out.println("Enter number:");


       // int num = Integer.parseInt(numbers.nextLine());





        for (String arg : args) { //args is an array of strings || make a string arg and arg is whatever it is in args
            try {
                int num = Integer.parseInt(arg);

                if (num % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } catch (Exception e){
                System.out.println(arg + " not integer");
            }
        }




    }
}

