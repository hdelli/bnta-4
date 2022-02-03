package com.bnta.week_one_fri;

public class Exercise3 {
    public static void main(String [] args ) {

         /*
            Write a program that reverses an array of Strings
            String[] content = {"you", "are", "how", "hello"}
            Tip. Use for loop and you to start at highest index.
            Output should be: hello how are you?. Note question mark at the end
        */
        String[] content = {"you", "are", "how", "hello"};

        for (int i = 0; i < content.length; i++) {
            System.out.println(i + " index -> " + content[i]);
        }

        System.out.println("reverse");

        String result = "";
        for (int i = content.length - 1; i >= 0; i--) {
            System.out.println(i + " index -> " + content[i]);
            result += content[i] + " ";
        }


        System.out.println(result.substring(0, result.length() - 1) + "?");
    }
}


/*
        // reversing arrays using loops= my attempt

        String[] content = {"you", "are", "how", "hello"};

        //loop to list the array

        for (int i = 0; i < content.length; i++) {
            System.out.println(content[i] + " ");

        }
        System.out.println("Reverse array:  ");

        String result = " ";
// loop to reverse it
        for (int i = content.length - 1; i >= 0; i--) {
            System.out.println(content[i] + " ");
        }


// adds ? to the end
        System.out.println(result.substring(result.length() -1) + "?");
    }


}
*/

