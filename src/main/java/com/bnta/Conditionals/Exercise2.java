package com.bnta.Conditionals;

public class Exercise2 {
    public static void main(String[] args) {
        String name1= "Andy";
        String name2= "Andy";
        String name3= new String("Andy");

        System.out.println(name1.equals(name3));

        if (name1 == name2) {
            System.out.println(name1 + " equal to " + name2);
        }

        if (name1 ==name3) {
            System.out.println(name1 + " equal to " + name3);
        }


    }
}
