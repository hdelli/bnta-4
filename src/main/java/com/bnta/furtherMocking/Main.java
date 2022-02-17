package com.bnta.furtherMocking;

public class Main {
    public static void main(String[] args) {

        PersonDAO personDAO = new PersonDataAccessService();
        PersonService personService = new PersonService(personDAO);
        personService.savePerson(new Person(1,"hajr",2));


    }
}
