package com.bnta.week_three.mon.car_oop_example;

import java.util.Arrays;

public class Garage { private int garageNumber;
    private int capacity;
    private Person owner;
    private boolean isOpen;
    private Car[] cars;

    public Garage(int garageNumber, int capacity, Person owner) {
        this.garageNumber = garageNumber;
        this.capacity = capacity;
        this.owner = owner;
        this.cars = new Car[capacity];
    }


    public Garage(boolean isOpen) {
        this.isOpen = isOpen;
    }



    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }



    public int getGarageNumber() {
        return garageNumber;
    }

    public void setGarageNumber(int garageNumber) {
        this.garageNumber = garageNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "garageNumber=" + garageNumber +
                ", capacity=" + capacity +
                ", owner=" + owner +
                ", isOpen=" + isOpen +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }
}
