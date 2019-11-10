package com.udemy.OOPMasterChallenge;

public class BreadRoll implements Ingredient
{
    public enum Type
    {
        White_Bun,
        Kaiser,
        Brown_rye,
        Toasted_Sesame
    }
    private Type breadRoll;
    private String name;
    private double cost;

    public BreadRoll(BreadRoll.Type breadRoll)
    {
        switch(breadRoll)
        {
            case White_Bun:
                name = "White bun";
                cost = 1.0;
                break;
            case Kaiser:
                name = "Kaiser bun";
                cost = 1.3;
                break;
            case Brown_rye:
                name = "Brown Rye bun";
                cost = 1.1;
                break;
            case Toasted_Sesame:
                name = "Toasted Sesame bun";
                cost = 1.0;
                break;
        }
    }

    @Override
    public String getName() {
        return breadRoll.name();
    }

    @Override
    public double getCost() {
        return cost;
    }
}
