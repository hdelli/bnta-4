package com.bnta.interfaceExample;
// this is an interface
//empty body of method
//that can be implemented by other classes
//An Interface is a class that has only a method body but no implementation.
// Any class implementing an Interface has to define or implement the methods of their own.
//abstract classes can have normal methods and abstract methods
//whereas interfaces only have abstract methods
public interface Vehicle {

     public void speed();

     void applyBreak();

     double getCurrentSpeed();


}
