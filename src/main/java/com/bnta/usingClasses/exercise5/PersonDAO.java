package com.bnta.usingClasses.exercise5;

import java.io.*;

public class PersonDAO {


        //try to start with DAO first
        // link the DAO to the file text
        File file = new File("/Users/hajrdelli/IdeaProjects/hello-bnta-4/src/main/java/com/bnta/usingClasses/exercise5/personDB.txt");


    //saveTofile() -- this will save any persons answers to the text file
        public void writeToFile(Person person){

                {
                    try {
                        Writer writer;  //calling on the Writer class - the output gives us access to the method of Writer
                        writer = new BufferedWriter(new FileWriter(file, true)); //another library similar to printWriter but it allows you to append/adding whats already there without deleting
                        writer.append(person.toString());


//                                (person.getFirstName()+ "," +
//                                person.getSurname() + "," +
//                               person.getEmail() + "\n");
                        writer.close();
//                        PrintWriter printWriter = new PrintWriter(file);
//                        printWriter.write(person.getFirstName());
//                        printWriter.close();

                    } catch (IOException e) {
                        e.printStackTrace(); //shows you where the error is occuring
                    }
                }
            }

        }

        //check the file we need to check if the file exists (in the main)
         //printwrite allows you to write in the text file





        //readFromFile() -- this will display all data in the text file





