package com.bnta.usingClasses.Exercise1;


import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//   Create & Save File~
//    Read first line
//    Turn row 1 into a person
//    Create a Person Class~
//    Id, firstName, lastName, email, gender ~
//    Create one person manually
//    Now use row 1 info to make person
//    Loop through and read multiple lines
//    Turn each row into a person
//    Create an array of Person[]
//    Create and store in array
public class Main {
    public static void main(String[] args) {

        PersonDAO personDAO = new PersonDAO();

        System.out.println(Arrays.toString(personDAO.people));


    }

}
