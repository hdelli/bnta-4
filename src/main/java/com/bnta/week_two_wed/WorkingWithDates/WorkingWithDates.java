package com.bnta.week_two_wed.WorkingWithDates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class WorkingWithDates {

    public static void main(String[] args) {
        LocalDateTime localDateTime= LocalDateTime.now(); //<-- current date of your machine
        System.out.println(localDateTime);

        LocalDate localDate= LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime= LocalTime.now();
        System.out.println(localTime);

        LocalDate d = LocalDate.of(1999,01,10);
        LocalDate d2 = LocalDate.of(1999,01,26);
        LocalDate dPlus200Days = d.plusDays(200);

       // d.until()


        System.out.println(d.getMonth());
        System.out.println(d.getYear());
        System.out.println(d.getDayOfWeek());
        System.out.println(d.isBefore(d2));
        System.out.println(d.isLeapYear());

        System.out.println(d.plusDays(200));
    }
}

// find number of days until end of year
// create class
// find today's current date
//use.until
//define end of the date
// connect them




//create a method that sums days of the month for a given array of LocalDates
//create a method
// going to give back an integer
//create an array
//one array is going to be input into a method
// create a for loop - add all the dates
// then whenever it loops each date add it to the temporary variable
//return a placeHolderName


