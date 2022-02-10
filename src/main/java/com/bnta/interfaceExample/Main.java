package com.bnta.interfaceExample;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Bicycle bicycle = new Bicycle();


        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bicycle);

        Person suraya = new Person("suraya", vehicles);

        for (Vehicle vehicle : suraya.getVehicles()) {
            vehicle.speed();
            System.out.println();
        }
    }

}
