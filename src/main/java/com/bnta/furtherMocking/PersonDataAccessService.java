package com.bnta.furtherMocking;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class PersonDataAccessService implements PersonDAO{

    @Override
    public void savePerson(Person person) throws IOException {
        // create file
        File file = new File("src/pperson.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(person.getId() + "," + person.getName() + person.getAge());

        // once you are done writing to the file
        printWriter.flush();
        printWriter.close();

        // read example
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }


    @Override
    public void deletePerson(int id) {

    }

    @Override
    public List<Person> getPeople() {
        return List.of();
    }

    @Override
    public Person getPersonById(int id) {
        return null;
    }
}
