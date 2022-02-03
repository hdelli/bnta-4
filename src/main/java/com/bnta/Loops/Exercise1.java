package com.bnta.Loops;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Question: 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Question: 2");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        // QUESTION 3
        // create a for loop which goes from 0 to 20
        // print each even value
        System.out.println("Question: 3");
        for (int i = 1; i <=20; i++) {
            if (i % 2 == 0) {

                //IF I%2 (modulus meaning 0.0 or 0.2) is equal to zero, the number is even when you divide by 2 you should get whole number
                System.out.println(i + "");
            }
        }

        System.out.println("Questions: 4");
        // create an array. Remember to manually set the size
        // create a for loop which goes from 0 to 10, adding each value to an array
        // print our array

        int[] numbers = new int[11];
        for (int i = 0; i <= 10 ; i++) {
            numbers[i] = i;
            System.out.println(Arrays.toString(numbers));

        }
/*
        for (int i = 0; i <numbers.length ; i++) {
            numbers [i]= i++;

            System.out.println(Arrays.toString(numbers[i]));

        }


 */

    }
}