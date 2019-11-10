package com.udemy.inheritance;

public class Wheels
{
    public enum WheelTypes
    {
        Goodyear,
        Michenlin,
        Pirelli,
        Bridgestone,
        Yokohama,
        Hankook
    }

    int amount;
    double frictionMultiplier;
    boolean isSnowTire;
    double value;
    WheelTypes Tires;

    public Wheels(int amount, double frictionMultiplier, boolean isSnowTire, double value, WheelTypes tires) {
        this.amount = amount;
        this.frictionMultiplier = frictionMultiplier;
        this.isSnowTire = isSnowTire;
        this.value = value;
        Tires = tires;
    }
}
