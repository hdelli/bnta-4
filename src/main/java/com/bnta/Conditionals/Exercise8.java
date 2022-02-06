package com.bnta.conditionals;

public class Exercise8 {
    public static void main(String[] args) {
         // In this final example, let's go one more step further and introduce a for loop to our
        // previous answer. The idea is to use a for loop to check if the provided character is present at any point within our word.
        // QUESTION 8

            // create a String variable and assign it a value
            // create a `for` loop which wraps around your answer from Question 7
            // modify your `if` statement to check the character at each index
            // Hint: use your internal, incrementing value of your `for` loop within the `.charAt()` method
            // print something to the console if the condition is met


        String dogs= "andyandmacey";
        int counter = 0;

        for (int i = 0; i <dogs.length() ; i++) {
            if (dogs.charAt(i) == 'y') {
                counter ++;
            }

        }

        System.out.println("String contains " + counter + " y");
    }
}
