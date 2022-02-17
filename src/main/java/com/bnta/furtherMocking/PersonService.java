package com.bnta.furtherMocking;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class PersonService {

    private final PersonDAO personDAO; //we accept the interface - this is linking the interface to the service

    public PersonService(PersonDAO personDAO) {  //passing personDAO and set as personDAO
        this.personDAO = personDAO;
    }

    public void savePerson(Person person) {
        if (person.getAge() == null ||
                person.getId() == null ||
                person.getName().length() == 0) {
            throw new IllegalStateException("Person cannot have empty fields");
        }

        boolean exists = doesPersonWithIdExists(person.getId());

        if (exists) {
            throw new IllegalStateException("person with id " + person.getId() + " already exists");
        }
        personDAO.savePerson(person);


    }


    public void deletePerson(int id) {
        boolean exists = doesPersonWithIdExists(id);
        if (!exists) {
            throw new IllegalStateException("person with id " + id + " not found");
        }
        personDAO.deletePerson(id);
    }


    public List<Person> getPeople() {
        return personDAO.getPeople();
    }
            //optional is a container object used to contain not-null objects -
    public Optional<Person> getPersonById(int id) {
        return personDAO
                .getPeople()
                .stream()
                .filter(person -> person.getId().equals(id))
                .findFirst();
    }

    private boolean doesPersonWithIdExists(Integer id) {
        return personDAO
                .getPeople()
                .stream()
                .anyMatch(p -> p.getId().equals(id));
    }
}
