package com.bnta.week_three.mon.car_oop_example;

public class GarageService {
    //This class performs all business logic for the following: (these are all methods)
    //1.add cars
    //2. how many cars are in garage
    //3. remove car
    //4. Open and close garage
    //5. isGarageFull
    //6. Filter electric cars
    //7. Filer non-electric cars
    //8.Clean garage


    public void addCar(Car car, Garage garage) {
        //check if open
            // if open check not full
                // then add car to garage
            //if full throw exception
        //if not open throw exception

        if (garage.isOpen()) { //check if it is not full so equal to null
            int currentCarsInGarageCount = 0;
            for (Car c : garage.getCars()) {
                if (c != null) {
                    currentCarsInGarageCount++;
                }
            }
            if (currentCarsInGarageCount < garage.getCapacity()) {
                for (int i = 0; i < garage.getCars().length; i++) {
                    if (garage.getCars()[i] == null) {
                        garage.getCars()[i] = car;
                        break; //if you find null break dont carry on looping
                    }

                }

            } else{
                throw new IllegalStateException(garage.getGarageNumber() + " is full.");
            }
        }else{
            throw new IllegalStateException(garage.getGarageNumber() + " is closed.");
        }
    }
}




