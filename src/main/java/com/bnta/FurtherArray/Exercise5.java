package com.bnta.furtherArray;

import java.util.Arrays;

public class Exercise5 {
    public static void main(String[] args) {
        String[] letters = new String[]{"a", "b", "c", "d"};  //The following shows the declaration as well as initialization of the array:
        System.out.println(Arrays.toString(letters));

        // start from your solution to Q5
        // create a String variable called `condition` which has the value "c"
        // create a Boolean variable called `hasC` which has the value `false`
        // create a `for` loop which goes through each item in our array, comparing it against our `condition` variable
        // if the two are equal, change the `hasC` value to `true`
        // once the `for` loop concludes, print out a message which tells you if `hasC` is `true` or `false`

        String condition = new String("c");
        System.out.println(condition);
        boolean hasC = false;
        System.out.println(hasC);

        for (String item: letters) {
            if (item == condition) {
                hasC = true;
                System.out.println(condition + " is in the array!");
            } else {
                System.out.println("The condition was not met");

            }
        }


            // using your array from Q5, create a `for` loop which prints each item in the array
            for (int i = 0; i < letters.length; i++) {
                System.out.println(letters[i]);
            }

            // using your answer to Q5, create another array which is A COPY off of your original array (using the `Arrays.copyOf()` method)
            // NOTE that the `.copyOf()` method accepts two arguments, first being the array that's being copied and second being the length of the new array
            // change the value at index 0 of the new array to "z"
            // print both of the arrays and compare
            String[] copyOfLetters = Arrays.copyOf(letters, letters.length);

            System.out.println(Arrays.toString(copyOfLetters));


            // using your answer to Q5, create a second array which is initialised using your original array
            // hint: instead of using the `new` keyword, try simply giving the name of your original array
            // change the value at index 0 of the new array to "z"
            // print both of your arrays and compare

            String[] secondArray = letters;
            secondArray[0] = "z";
            System.out.println(Arrays.toString(letters));
            System.out.println(Arrays.toString(secondArray));


            //exercise 8:
            // declare a new array which can hold the numbers from 1-10 (inclusive)
            // create a `for` loop which initialises this array with the numbers 1-10
            // print the array to the console

            int[] numbers = new int[10];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = i + 1;
            }

            System.out.println(Arrays.toString(numbers));


            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = numbers[i] * 2;

            }
            System.out.println(Arrays.toString(numbers));


            // adding onto your example from Q9, now create a second `for` loop which reassigns each value in the array to be double the initial value
            // again print the array


        }
    }


