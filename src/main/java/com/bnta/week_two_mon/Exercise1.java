package com.bnta.week_two_mon;

public class Exercise1 {
    public static void main(String[] args) {

        String r = reverse("Hajr");
        System.out.println();

    }

    public static String reverse(String r) {
        String output = "";

        for (int i = r.length() - 1; i >= 0; i--) {
            output += r.charAt(i);
        }
        return output;
    }

    }







        /*
        String r = reverse("HELLO");
        System.out.println(r);

    }

    public static reverse(String s) {
        // store each character in an array then reverse it

        char [] letters = new char[s.length()];

        int letterIndex=0;
        for (int i= s.length() -1; i >= 0; i--) {
            letters[letterIndex] =s.charAt(i);
            letterIndex++; // goes to the next character, this loop goes from backwards
        }

        String reverse ="";
        for (int i=0; i<s.length(); i++) //starts 0 always start from the first character of the array//
            {
            reverse = reverse + letters[i];
        }

        return reverse;
    }


*/









        /*
        //Invoke the function
        System.out.println(reverse("Wendy"));
        System.out.println();

        static String reverse(String input.txt) {
            String output = "";
            for (int i=input.txt.length -1; i >=0; i--) {
                System.out.println(input.txt.charAt(i));
                output += input.txt.charAt(i);

            }
            return output; */

