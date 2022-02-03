package com.bnta.week_one_fri;

public class Exercise4 {
    public static void main(String[] args) {

        String numbers= ("0.90, 1.00, 9.00, 8.78, 0.01");

        //Change from normal string to an array we can do:
        //String[] numbersArray = numbers.split(".");

        //To double the list:

        //double result = 0;
        //System.out.println(numbers);

      String [] number= {"0.90", "1.00", "9.00", "8.78", "0.01"};
      double result = 0;
       // System.out.println(number[i] + " ");

        for (int i = 0; i < number.length; i++) {
           // double numberDbl = Double.parseDouble(number);
           // result = result + numberDbl;

        }

        System.out.println(result);



    }
}