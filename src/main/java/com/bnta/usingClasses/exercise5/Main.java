package com.bnta.usingClasses.exercise5;
//Create a survey questionnaire application that saves users answers to a file. Think about the classes and that you might need.
// For example, Questionnaire - id, createdAt, List of Questions Question - the question Person - name, email, dob
//Use your imagination and go bananas with your implementatio

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PersonService personService = new PersonService();
        personService.addPerson();






    }
}
