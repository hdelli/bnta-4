package com.bnta.week_three.mon.car_oop_example;

public class Person {


    private String name;
    private String email;
    private int age;
    private Car[] cars;


    public Person(String name, String email, int age, Car[] car) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.cars = car;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }


}
