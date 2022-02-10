package com.bnta.interfaceExample;

public class Car implements Vehicle{

    @Override
    public void speed() {
        System.out.println("start engine");
        System.out.println("gear");
        System.out.println("accelerate");

    }

    @Override
    public void applyBreak() {

    }

    @Override
    public double getCurrentSpeed() {
        return 0;
    }
}
