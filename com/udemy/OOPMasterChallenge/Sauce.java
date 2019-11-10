package com.udemy.OOPMasterChallenge;

import java.util.List;

public class Sauce implements Ingredient
{
    private String name;
    private double cost;

    public enum Types
    {
        Ketchup,
        Curry_Ketchup,
        BBQ_Sauce,
        Mustard,
        Ranch,
        Chipotle_Sauce
    }

    private Types sauce;
    public Sauce(Sauce.Types Sauce)
    {
        this.sauce = Sauce;
        this.cost = 0.5;
        switch (sauce)
        {

            case Ketchup:
                this.name = "Ketchup";
                break;
            case Curry_Ketchup:
                this.name = "Curry Ketchup";
                break;
            case BBQ_Sauce:
                this.name = "BBQ Sauce";
                break;
            case Mustard:
                this.name = "Mustard";
                break;
            case Ranch:
                this.name = "Ranch";
                break;
            case Chipotle_Sauce:
                this.name = "Chipotle Sauce";
                break;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }

}
