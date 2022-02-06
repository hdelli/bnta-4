package com.bnta.random;


public class Main {
    public static void main(String [] args ) {
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

//list of Arrays
        String name = "Lisa, Emily, Will";
        String[] names = {"Lisa", "Emily", "Will"};
                System.out.println(name);




//if statements
                String hello= "Hello";
                if (hello.equals("Ola")) {
                    System.out.println("Portuguese");
                }
                else if (hello.equals("Hello")) {
                    System.out.println("English");
                }


                //switch statements








    }
}
