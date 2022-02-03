package com.bnta.week_two.fri.oop;
//you need a setter
//this is a method that sets the values at the bottom you have
public class Person { //if you remove the public it will be package protected| this is all accessable but every method is either private or public
    private String name; //dont want to give access to the user to these fields they are accessed by the getters
    private int age;
    private SkinColor skinColor; //this is an enum so datatype is the name of the enum


    //constructor
    //theres a default constructor
    // this allows you to make a new object
    // it is used to intialise the object
    //if you dont set the first constructor the computer will set a default and therefore will go through setters

    public Person(String name) {

    }

    // the things inside the bracket we need to pass it this kind

    public Person (String name, int age, SkinColor skinColor) {
       // this.setSkinColor();
        this.name = name;
        this.age = 0;   //this.class accessing the top part
    }//this allows you to say new Person; a default constructer
    //if you change it to private you will have a problem in the main class and

//set private so will only be able to access the getters
    //always make them private
    //but users will be able to access the fields through the getters and setters

    //setter e.g this. sets the variable to that this allows you to set a value/ change the values
    // you can have setter only without constructor but whenever it is called upon it - name.setColour makes it long
    //so just use the constructor

    public void setName(String name) {
        this.name = name;
    }


    //setter
    public void setAge(String name) {
        this.name = name;
    }


    //setter
    public void setSkinColor(String name) {
        this.name = name;
    }

    //getter a method to return a property
    public SkinColor getSkinColor() {
        return skinColor;
    }

    //The purpose of Method Overriding is that if the derived class wants to give its own implementation it can give by overriding the method of the parent class.
    // When we call this overridden method, it will execute the method of the child class, not the parent class.

 @Override
    public String toString() {
        return "Person{" + "}";
 }
}
