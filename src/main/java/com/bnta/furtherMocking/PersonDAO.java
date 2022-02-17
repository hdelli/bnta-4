package com.bnta.furtherMocking;

import java.io.IOException;
import java.util.List;

public interface PersonDAO {

        //these are methods but empty body - an interface
    //this will be used by the service
    void savePerson(Person person) throws IOException;
    void deletePerson(int id);
    List<Person> getPeople();
    Person getPersonById(int id);
}
