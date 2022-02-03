package com.bnta.week_three.mon.car_oop_example;

import java.rmi.ConnectIOException;

public class Main {
    public static void main(String[] args) {


        Car car = new Car(
                "Honda",
                "1234",
                false
        );

        Car copy = new Car(
                "Honda",
                "1234",
                false
        );


        Car[] connieCars = {car};
    }
}

/*
        Person connie = new Person(
               "Connie",
                "connie@gmail.com",
                24
        );

        Garage conniesGarage = new Garage (
                1,
                3,
                "connie"
        );

        GarageService garageService = new GarageService();
        garageService.addCar(conniesGarage,
                connie.getCars()[0]);
        System.out.println(conniesGarage);

    }
}
  */