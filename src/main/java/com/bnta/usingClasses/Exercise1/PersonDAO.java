package com.bnta.usingClasses.Exercise1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class PersonDAO {

    private Person person;
    public Person[] people;

    //constructor for DAO not method
    public PersonDAO() {

        try {

            String directory = "src/main/java/com/bnta/usingClasses/Exercise1";
            String fileName = "data.txt";
            File data = new File(directory, fileName);

            //function to get number of lines i.e number of people
            int numberOfPeople = getNumberOfLines(data);
            System.out.println("number of people" + numberOfPeople);

            //creating person array
            Person[] personArr= new Person[numberOfPeople];



//          ======CREATED FOR ONE PERSON=========
//            Scanner scanner = new Scanner(data);
//            //reads the first line
//            scanner.nextLine();
//
//
//
//            String onePersonInfo = scanner.nextLine(); //second line with actual info
//            System.out.println(onePersonInfo);
//            //splitting this string into its ID, first name, last name email and gender
//            String[] onePersonInfoArray = onePersonInfo.split(",");
//            System.out.println(Arrays.toString(onePersonInfoArray));
//            System.out.println(onePersonInfoArray[1]);
//
//            int id = Integer.parseInt(onePersonInfoArray[0]);
//            String firstName= onePersonInfoArray[1];
//            String lastName= onePersonInfoArray[2];
//            String email= onePersonInfoArray[3];
//            String gender= onePersonInfoArray[4];
//
//            System.out.println(email);
//            //================CREATED SECOND PERSON================
//            Person person = new Person(id, firstName, lastName,email,gender);
//            System.out.println(person);
//
//            personArr[0] = person;


            Scanner scanner = new Scanner(data);
            //reads the first line
            scanner.nextLine();

            int arrPosition = 0;
            while(scanner.hasNext()) {

                String onePersonInfo = scanner.nextLine(); //second line with actual info
                System.out.println(onePersonInfo);
                //splitting this string into its ID, first name, last name email and gender
                String[] onePersonInfoArray = onePersonInfo.split(",");
                System.out.println(Arrays.toString(onePersonInfoArray));
                System.out.println(onePersonInfoArray[1]);

                int id = Integer.parseInt(onePersonInfoArray[0]);
                String firstName= onePersonInfoArray[1];
                String lastName= onePersonInfoArray[2];
                String email= onePersonInfoArray[3];
                String gender= onePersonInfoArray[4];

                System.out.println(email);

                //Creating person and storing in person array
                Person person = new Person(id, firstName, lastName,email,gender);

                personArr[arrPosition] = person;
                arrPosition++;

            }

            people = personArr;
        } catch (IOException e) {
            System.out.println("File not found");

        }







    }

    public int getNumberOfLines(File file) {
        try {


            Scanner scanner = new Scanner(file);
            //reads the first line
            //ignore first line- not a person
            scanner.nextLine(); //will only read


            int numberOfLines = 0;
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
                System.out.println("----------");
                numberOfLines++;
            }

            return numberOfLines;


        } catch (IOException e) {
            System.out.println("File not found");

        }

        return 0;
    }
    }

