package com.bnta.methods;

public class Exercise5 {
    public static void main(String[] args) {
        //Call/evoke method here
        String result = capitalFirstLetter("hey there");
        System.out.println(result);
    }

    //Write method here
    //pseudo-code - plain english description of what the code will do
    // Method signature - takes string as argument then returns String

    public static String capitalFirstLetter(String input) //this name can be used inside the method)
    //capitalise the first letter of input.txt
    { // String capitalString = input.txt.substring(0, 1).toUpperCase() + input.txt.substring(1).toLowerCase();
        //couldve put it here
            // return the modified String
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();



    }
}
