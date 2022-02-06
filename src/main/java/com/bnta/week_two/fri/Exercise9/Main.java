package com.bnta.week_two.fri.Exercise9;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(EngineType.Diesel,Manufacturer.ASTON_MARTIN, 100_000);
        System.out.println(car1);
        car1.setPrice(10);
        System.out.println(car1);
        System.out.println("car 1 price is currently: " + "£" + car1.getPrice());


        Car car2= new Car(EngineType.Hydrogen, Manufacturer.LAMBORGHINI, 200_000);
        Car car3= new Car(EngineType.Diesel, Manufacturer.PORSCHE, 250_000);

        Car[] cars={car1,car2,car3};
        //Making a new carDealership:
        Dealership suad = new Dealership("Susu",3);
        //creating a  service

        DealershipServices dealershipServices = new DealershipServices();

        dealershipServices.addCar(car3, suad);

        System.out.println(suad);



        

/*
        for (Car car : cars) {
            suad.addCarToDealership(car);

        }
        System.out.println(suad);

        suad.findCarByManufacturer("Porsche");



 */

        /*
                how to loop different ways
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
            
        }


        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
              */
    }

                      




}
