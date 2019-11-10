package com.udemy.OOPMasterChallenge;

public class Extras implements Ingredient
{
    public enum SidesAndBeverages
    {
        Chips,
        Curly_Fries,
        Chili_Cheese_Fries,
        Coca_cola,
        Coca_cola_Light,
        Coca_cola_Zero,
        Fanta,
        Sprite,
        Water,
        Water_Carbonated
    }
    private SidesAndBeverages extra;
    private String name;
    private double cost;

    public Extras(Extras.SidesAndBeverages extras)
    {
        switch (extras)
        {
            case Chips:
                name = "Chips";
                cost = 1.5;
                break;
            case Curly_Fries:
                name = "Curly Fries";
                cost =  1.8;
                break;
            case Chili_Cheese_Fries:
                name = "Chili Cheese Fries";
                cost = 2.3;
                break;
            case Coca_cola:
                name = "Coca Cola";
                cost = 1.8;
                break;
            case Coca_cola_Light:
                name = "Coca Cola Light";
                cost = 1.8;
                break;
            case Coca_cola_Zero:
                name = "Coca Cola Zero";
                cost = 1.8;
                break;
            case Fanta:
                name = "Fanta";
                cost = 1.8;
                break;
            case Sprite:
                name = "Sprite";
                cost = 1.8;
                break;
            case Water:
                name = "Water";
                cost = 0.99;
                break;
            case Water_Carbonated:
                name = "Carbonated Water";
                cost = 0.99;
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
