package com.bnta.week_two.fri.Exercise9;

public class DealershipServices {
    //Business logic
    //this class performs all the business logic for:
    //1.Add car
    //2. how many cars in the garage
    //3. find first with named manufactrer
    //Write a method to count the number of cars in the dealership
    //Count cars
    //Input carDealerShip
    //Output - int Num of cars




    public void addCar(Car newCar, Dealership dealership){
        //A
        dealership.getCars()[0] = newCar;

        //loop through the array if empty add car

        for (int i = 0; i <dealership.getCars().length; i++) {
            if (dealership.getCars()[i] == null){
                dealership.getCars()[i] = newCar;
                break;
            }
            System.out.println("empty position");

        }


        System.out.println("working");
    }
}
