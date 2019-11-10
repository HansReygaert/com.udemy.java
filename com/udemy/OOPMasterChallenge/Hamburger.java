package com.udemy.OOPMasterChallenge;

import java.util.ArrayList;
import java.util.List;

public class Hamburger implements Ingredient
{
    private String name;
    private Protein protein;
    private BreadRoll bun;
    private List<Condiments> condiments;
    private List<Extras>sides;
    private double price;

    public Hamburger(String name, Protein protein, BreadRoll.Type breadRoll, double price) {
        this.name = name;
        this.protein = protein;
        this.bun = new BreadRoll(breadRoll);
        this.price = price;
        condiments = new ArrayList<Condiments>();
        sides = new ArrayList<Extras>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return price;
    }

    public void getPrice()
    {
        price += protein.getCost();
        price += bun.getCost();

        for (Ingredient i : condiments)
        {
            price += i.getCost();
        }
        for(Ingredient i : sides)
        {
            price += i.getCost();
        }
    }
}
