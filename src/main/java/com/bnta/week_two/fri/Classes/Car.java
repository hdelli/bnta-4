package com.bnta.week_two.fri.Classes;
/*
Create a class to represent a car. The car should have properties representing the manufacturer, price, and engine type (eg. petrol, electric, etc).
Manufacturer - enum
price- double
engine type

Write getters for each of these properties. Test them in Main.

Write setters for the properties. Test them in Main.
 */


public class Car {
    //modifier class name
    private EngineType engineType;
    private Manufacturer manufacturer;
    private double price;
//constructor - allows you to make objects
    public Car(){}

    public Car(EngineType engineType, Manufacturer manufacturer, double price) {
        this.engineType = engineType;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineType=" + engineType +
                ", manufacturer=" + manufacturer +
                ", price=" + price +
                '}';
    }
}
