package com.bnta.week_two_mon;

public class Exercise2 {
    public static void main(String[] args) {

        String input = "   b ri   ght net   work  ";
        System.out.println(fix(input));

    }
    public static String fix(String input) {
        String withoutspace = input.replaceAll("\\s", "");

        // string.replaceAll ("\\s") is a way to delete all whitespace between strings
        System.out.println(withoutspace);
        return withoutspace.substring(0,1).toUpperCase() + withoutspace.substring(1,6) + " " + withoutspace.substring(6,7).toUpperCase() + withoutspace.substring(7,13);
// this return is adding space and changing the B and N to uppercase
        //0,1 is 0= beginning and 1= is ending of the letter so 0,1 is B so 1,2

    }



}
