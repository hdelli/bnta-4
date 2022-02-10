package com.bnta.usingClasses.exercise5;

import java.util.Scanner;

public class PersonService {


    //Add person
    public void addPerson(){
        System.out.println("Welcome to the PLanet of the Apes Questionnaire");
        System.out.println("Enter your First Name: ");
        Scanner scanner = new Scanner(System.in);
        String firstName =scanner.nextLine();
        System.out.println("Enter your Last Name: ");
        String LastName =scanner.nextLine();
        System.out.println("Enter email: ");
        String email =scanner.nextLine();

        Person person = new Person(firstName,LastName,email);

        PersonDAO personDAO = new PersonDAO();
        personDAO.writeToFile(person);

    }

    //Display all person
}
