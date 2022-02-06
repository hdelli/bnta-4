package com.bnta.week_two.fri.Exercise9;

import java.util.Arrays;

/*Create a class to represent a car dealership. It should have properties representing its name, the maximum number of cars it can have on display and all the cars currently in stock.

 How can we figure out how big that data structure should be?

Hint 2: A brand new dealership won't have any cars yet. Do we need to pass that information in the constructor when we create a dealership,
 or can we define our class in such a way that every new dealership starts with no cars?


 */
public class Dealership {

    private String dealerName;
    private int maxCars;
    private Car[] cars;

    public Dealership() {
    }

    ;

    public Dealership(String dealerName, int maxCars) {
        this.dealerName = dealerName;
        this.maxCars = maxCars;
        this.cars = new Car[maxCars];
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public int getMaxCars() {
        return maxCars;
    }

    public void setMaxCars(int maxCars) {
        this.maxCars = maxCars;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }


    @Override
    public String toString() {
        return "Dealership{" +
                "dealerName='" + dealerName + '\'' +
                ", maxCars=" + maxCars +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }

    public int numberOfCars() {
        int totalCars = 0;
        for (int i = 0; i < this.maxCars; i++) {
            if (this.cars[i] != null) {
                totalCars++;
            }
        }
        return totalCars;

    }
//    Write a method to count the number of cars in the dealership. It doesn't need to take any parameters and should return an int.
//    Write another method to add a car to the dealership. The method should have a Car parameter and doesn't need to return anything.
//    Test your method by counting the number of cars, adding a new car then counting again to make sure the number has gone up by one.
//    Hint: You will need some way of finding the first empty slot in the array to save the Car in. Maybe checking each slot in the array in turn would help?


    public void addCarToDealership(Car newCar) {
        for (int i = 0; i < this.maxCars; i++) {
            if (this.cars[i] == null) {
                this.cars[i] = newCar;
                break;
            }

        }


    }

//    Write a method for the dealership called findCarByManufacturer which takes a String as a parameter and returns a Car object.
//    The method should return the first Car the dealership has in stock with a manufacturer property matching the value passed to the method.
//
//  Hint 1: Think carefully about how you will access the information you need from the Cars. Remember the methods you wrote in exercise 2...
//
//    Hint 2: To test this in Main you will need to: - create some Car objects - add them to the Dealership - store the result of your findCarByManufacturer method to a variable -
//    print the variable


    public Car findCarByManufacturer(String manufacturerName) {
   //     System.out.println(manufacturerName);
//loop through all the cars


        for (Car car : this.cars) {
//            System.out.println(car);
            // Get the car manufacturer
            try {

                if(car.getManufacturer().name().toLowerCase().equals(manufacturerName.toLowerCase())){
                    return car;
                }
            }catch (Exception e){
                System.out.println("No Car");
            }

        }

        //Return a
        return new Car();

    }
//get car manufacturer


//        for (int i = 0; i < this.maxCars; i++) {
//            if (this.car[i] = ASTON_MARTIN) {
//                this.car[i] = specificCar;


    }

