package com.udemy.inheritance;

public class Vehicle {
    //The base class
    private double speed;
    private Position position;
    private double acceleration;


    public void accelerate(double acceleration)
    {
        this.acceleration = acceleration;
    }
    public void applyBreak()
    {
        accelerate(acceleration * -1);
    }
    public double getSpeed()
    {
        return  speed;
    }


}
