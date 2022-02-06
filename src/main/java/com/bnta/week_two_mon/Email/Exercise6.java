package com.bnta.week_two_mon.Email;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {


        String inputs = getUserEmail();


        if (inputs.contains(specialAt()) && inputs.contains(specialCom())) {
            System.out.println("Valid email");
        } else {
            System.out.println("invalid email");

        }
    }

    private static String getUserEmail() {
        System.out.println("Enter email:");
        Scanner n = new Scanner(System.in);
        String emailInput = n.nextLine();
        return emailInput;
    }

    public static String specialAt() {
        // String input.txt = n.nextLine();
        String specialCharacter = "@";
        return specialCharacter;
    }

    public static String specialCom() {
        // String input.txt = n.nextLine();
        String specialCharacter = ".com";
        return specialCharacter;
    }
}





